package it.uniroma3.siw.facade;

import it.uniroma3.siw.model.*;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class AddressFacade {
	@PersistenceContext(unitName="unit-siw-project")//da ora in poi ci pensa l'application server a gestire la creazione e chiusura
	private EntityManager em;
	
	//costruttore vuoto;
	public AddressFacade(){
	}
	public Address createAddress(String street, String city, String state, int zipCode, String country){
		try {
			Address address = new Address(street, city, state, zipCode, country);
			em.persist(address);
			return address;
		} catch (Exception e) {
			return null;
		}
	}
}
