package it.uniroma3.siw.controller;

import java.util.Date;
import java.util.List;

import it.uniroma3.siw.facade.CustomerFacade;
import it.uniroma3.siw.model.Address;
import it.uniroma3.siw.model.Customer;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

@ManagedBean
public class CustomerController {
	@EJB
	private CustomerFacade customer_facade;
	
	@ManagedProperty(value="#{param.id}")
	private Long id;
	
    private String firstName;    
    private String lastName;  
    private String email;
    private Date dateOfBirth;
    private Date registrationDate;
    private Address address;
    
    private Customer customer;
    
	private List<Customer> customers;
	
	public String createProduct(){
		this.customer = customer_facade.createCustomer(firstName, lastName, email, dateOfBirth, registrationDate, address);
		return "mostraCliente";
	}
	
	public String listCustomers(){
		this.customers = customer_facade.getAllCustomers();
		return "listaClienti";
	}
	
	public String retrieveCustomer(){
		this.customer = customer_facade.getCustomer(id);
		return "mostraCliente";
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

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public List<Customer> getCustomers() {
		return customers;
	}

}
