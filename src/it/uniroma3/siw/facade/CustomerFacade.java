package it.uniroma3.siw.facade;

import javax.ejb.Stateless;

import it.uniroma3.siw.model.*;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless(name="customerFacade")
public class CustomerFacade {
	
	@PersistenceContext(unitName="unit-jee-es")//da ora in poi ci pensa l'application server a gestire la creazione e chiusura
	private EntityManager em;
	
	//costruttore vuoto;
	public CustomerFacade(){
	}
	
	public User createCustomer(String firstName, String lastName, String email, String password, Date dateOfBirth, Date registrationDate, Address address){
		try {
			User customer = new Customer(firstName,lastName,email, password, dateOfBirth,registrationDate, address);
			em.persist(customer);
			return customer;
		} catch (Exception e) {
			return null;
		}
		
	}
	
	public User getCustomer(Long id){
		try {
			String stringa_query = "SELECT c FROM Customer c WHERE c.id = :id";
			User customer = (Customer)(em.createQuery(stringa_query).setParameter("id", id).getResultList().get(1));
			return customer;
		} 
		catch (Exception e) {
			return null;
		}
	}
	
	public User getCustomer(String email){
		try {
			String stringa_query = "SELECT c FROM Customer c WHERE c.email = :email";
			User customer = (Customer)(em.createQuery(stringa_query).setParameter("email", email).getResultList().get(1));
			return customer;
		} 
		catch (Exception e) {
			return null;
		}
	}
	
	@SuppressWarnings("unchecked")
	public List<User> getAllCustomers(){
		try {
			LinkedList<User> customers  = (LinkedList<User>) em.createQuery("SELECT cs FROM Customer cs").getResultList();
			return customers;
		} catch (Exception e) {
			return null;
		}
	}
	
	public void updateCustomer(User customer){
		em.merge(customer);
	}
	
	public void deleteCustomer(User customer){
		em.remove(customer);
	}
	
	public void deleteCustomer(Long id){
		User customer = em.find(Customer.class, id);
		deleteCustomer(customer);
	}
	
}
