package it.uniroma3.siw.controller;

import it.uniroma3.siw.facade.AddressFacade;
import it.uniroma3.siw.facade.CustomerFacade;
import it.uniroma3.siw.model.Address;
import it.uniroma3.siw.model.Customer;

import java.util.Date;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;


@ManagedBean
@RequestScoped
public class CustomerSignUPController {

	/*
	 * Lato Customer
	 */
	@ManagedProperty(value="#{param.id}")
	private Long idC;

	private String firstName;

	private String lastName;
	private String email;
	private String password;

	private Date dateOfBirth;
	private Date registrationDate;

	private Customer customer;

	@EJB
	private CustomerFacade customerFacade;

	/*
	 * Lato Address
	 */
	@ManagedProperty(value="#{param.id}")
	private Long idA;

	private String street;
	private String city;
	private String state;
	private int zipCode;
	private String country;

	private Address address;

	@EJB
	private AddressFacade addressFacade;

	public String signUp(){
		try {
			Customer c = this.customerFacade.getCustomer(email);
			if(c!=null){
				System.out.println("mail duplicata");
				return "erroreMailDuplicata";
			}
			this.address = new Address(street, city, state, zipCode, country);
			this.customer = this.customerFacade.createCustomer(firstName, lastName, email, password, dateOfBirth, new Date(), address);
			this.firstName=this.customer.getFirstName();
			this.lastName=this.customer.getLastName();
			return "customerHome";
		} catch (Exception e) {
			return "customerSignUp";
		}
	}

	public Long getIdC() {
		return idC;
	}

	public void setIdC(Long idC) {
		this.idC = idC;
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

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public CustomerFacade getCustomerFacade() {
		return customerFacade;
	}

	public void setCustomerFacade(CustomerFacade customerFacade) {
		this.customerFacade = customerFacade;
	}

	public Long getIdA() {
		return idA;
	}

	public void setIdA(Long idA) {
		this.idA = idA;
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

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public AddressFacade getAddressFacade() {
		return addressFacade;
	}

	public void setAddressFacade(AddressFacade addressFacade) {
		this.addressFacade = addressFacade;
	}
}
