package it.uniroma3.siw.controller;

import it.uniroma3.siw.facade.CustomerFacade;
import it.uniroma3.siw.model.*;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

@ManagedBean
public class CustomerController extends UserController{
	@EJB
	private CustomerFacade customer_facade;
    
    private User customer;
    
	public String createCustomer(){
		this.customer = customer_facade.createCustomer(getFirstName(), getLastName(), getEmail(), getPassword(), getDateOfBirth(), getRegistrationDate(), getAddress());
		return "mostraCliente";
	}
	
	public String retrieveCustomer(){
		this.customer = customer_facade.getCustomer(getId());
		return "mostraCliente";
	}

	public User getCustomer() {
		return customer;
	}

	public void setCustomer(User customer) {
		this.customer = customer;
	}
	
	public String CustomerLogin(){
		User found = customer_facade.getCustomer(getEmail());
		if(found!=null){
			if(getPassword().equals(found.getPassword())){
				return "customerHome";
			}
		}
		return "index";
	}
	
}
