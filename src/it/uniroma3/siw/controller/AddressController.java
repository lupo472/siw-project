package it.uniroma3.siw.controller;

import it.uniroma3.siw.facade.*;
import it.uniroma3.siw.model.*;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="addressController")
@SessionScoped
public class AddressController {
	@EJB
	private AddressFacade address_facade;
	
	@ManagedProperty(value="#{param.id}")
	private Long id;
	
	private String street;
	private String city;
	private String state;
	private int zipCode;
	private String country;
	
	private Address address;
	
	public void createAddress() {
		this.address = address_facade.createAddress(street, city, state, zipCode, country);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
	
	
}
