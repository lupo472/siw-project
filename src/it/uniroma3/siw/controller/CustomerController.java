package it.uniroma3.siw.controller;

import java.util.Date;

import it.uniroma3.siw.facade.*;
import it.uniroma3.siw.model.*;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


@ManagedBean
@SessionScoped
public class CustomerController{

	@EJB
	private CustomerFacade customer_facade;

	private Customer customer;

	private String firstName;

	private String lastName;
	private String email;
	private String password;

	private Date dateOfBirth;
	private Date registrationDate;
	private Address address;

	/*
	 * Lato Address
	 */
	private String street;
	private String city;
	private String state;
	private int zipCode;
	private String country;

	@EJB
	private AddressFacade addressFacade;

	//	public String retrieveCustomer(){
	//		this.customer = customer_facade.getCustomer(getId());
	//		return "customerHome";
	//	}

	public String customerLogin(){
		try {
			Customer found = customer_facade.getCustomer(getEmail());
			if(this.getPassword().equals(found.getPassword())){
				this.customer=found;
				return "customerHome";
			}
			else return "customerLogin";
		} catch (NullPointerException e) {
			return "customerLogin";
		}
	}

	public String customerLogout(){
		this.customer = null;
		this.email = null;
		this.password = null;
		return "index";
	}


	public String signUp(){
		try {
			Customer c = this.customer_facade.getCustomer(email);
			if(c!=null){
				System.out.println("mail duplicata");
				return "erroreMailDuplicata";
			}
			else{
				this.address = new Address(street, city, state, zipCode, country);
				this.customer = this.customer_facade.createCustomer(firstName, lastName, email, password, dateOfBirth, new Date(), address);
				return "customerHome";
			}
		} catch (Exception e) {
			return "customerSignUp";
		}
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
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

	public CustomerFacade getCustomer_facade() {
		return customer_facade;
	}

	public void setCustomer_facade(CustomerFacade customer_facade) {
		this.customer_facade = customer_facade;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getZipCode() {
		return zipCode;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public AddressFacade getAddressFacade() {
		return addressFacade;
	}

	public void setAddressFacade(AddressFacade addressFacade) {
		this.addressFacade = addressFacade;
	}
}
