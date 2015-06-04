package it.uniroma3.siw.controller;

import java.util.Date;

import it.uniroma3.siw.facade.CustomerFacade;
import it.uniroma3.siw.model.*;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@ManagedBean
@SessionScoped
public class CustomerController extends UserController{
	@EJB
	private CustomerFacade customer_facade;
    
    private User customer;
    
    @ManagedProperty(value="#{param.id}")
    private Long id;

    private String firstName;

    private String lastName;
    private String email;
    private String password;

    private Date dateOfBirth;
    private Date registrationDate;
    private Address address;
    
	public String createCustomer(){
		this.customer = (Customer)customer_facade.createCustomer(firstName, lastName, email, password, dateOfBirth, registrationDate, address);
		return "customerHome";
	}
	
	public String retrieveCustomer(){
		this.customer = customer_facade.getCustomer(getId());
		return "customerHome";
	}
	
	public String customerLogin(){
		User found = customer_facade.getCustomer(getEmail());
		if(found!=null){
			if(this.getPassword().equals(found.getPassword())){
				return "customerHome";
			}
		}
		return "customerLogin";
	}

	public User getCustomer() {
		return customer;
	}

	public void setCustomer(User customer) {
		this.customer = customer;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

}
