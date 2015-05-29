package it.uniroma3.siw.controller;

import it.uniroma3.siw.facade.ProductFacade;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

@ManagedBean
public class AddressController {
	@EJB
	private ProductFacade product_facade;
	
	@ManagedProperty(value="#{param.id}")
	private Long id;
	
	private String street;
	private String city;
	private String state;
	private int zipCode;
	private String country;
}
