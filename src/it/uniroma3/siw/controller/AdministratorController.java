package it.uniroma3.siw.controller;


import java.util.Date;

import it.uniroma3.siw.facade.*;
import it.uniroma3.siw.model.*;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class AdministratorController{
	@EJB
	private AdministratorFacade administrator_facade;

    private Administrator administrator;
    
//    @ManagedProperty(value="#{param.id}")
//    private Long id;

    private String firstName;

    private String lastName;
    private String email;
    private String password;

    private Date dateOfBirth;
    private Date registrationDate;
    
    private Address address;
    
	public String createAdministrator(){
		this.administrator= administrator_facade.createAdministrator(firstName, lastName, email, password, dateOfBirth, registrationDate, address);
		return "mostraAmministratore";
	}
	
	public String retrieveAdministrator(){
		this.administrator = administrator_facade.getAdministrator(this.administrator.getId());
		return "mostraAmministratore";
	}


	public String administratorLogin(){
		try {
			Administrator found = administrator_facade.getAdministrator(getEmail());
				if(this.getPassword().equals(found.getPassword()))
					return "administratorHome";
				return "administratorLogin";
		} catch (NullPointerException e) {
			return "administratorLogin";
		}		
	}

	public String administratorLogout(){
		this.administrator = null;
		this.email = null;
		this.password = null;
		return "index";
	}
	
	public Administrator getAdministrator() {
		return administrator;
	}

	public void setAdministrator(Administrator administrator) {
		this.administrator = administrator;
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Date getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public AdministratorFacade getAdministrator_facade() {
		return administrator_facade;
	}

	public void setAdministrator_facade(AdministratorFacade administrator_facade) {
		this.administrator_facade = administrator_facade;
	}
}
