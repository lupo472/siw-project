package it.uniroma3.siw.controller;


import it.uniroma3.siw.facade.*;
import it.uniroma3.siw.model.User;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

@ManagedBean
public class AdministratorController extends UserController{
	@EJB
	private AdministratorFacade administrator_facade;

    private User administrator;
    
	public String createAdministrator(){
		this.administrator= administrator_facade.createAdministrator(getFirstName(), getLastName(), getEmail(), getPassword(), getDateOfBirth(), getRegistrationDate(), getAddress());
		return "mostraAmministratore";
	}
	
	public String retrieveAdministrator(){
		this.administrator = administrator_facade.getAdministrator(getId());
		return "mostraAmministratore";
	}

	public User getAdministrator() {
		return administrator;
	}

	public void setAdministrator(User administrator) {
		this.administrator = administrator;
	}
	
	public String AdministratorLogin(){
		User found = administrator_facade.getAdministrator(getEmail());
		if(found!=null){
			if(getPassword().equals(found.getPassword())){
				return "administratorHome";
			}
		}
		return "index";
	}
}
