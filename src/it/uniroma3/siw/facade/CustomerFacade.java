package it.uniroma3.siw.facade;

import javax.ejb.Stateless;

import it.uniroma3.siw.model.Customer;
import it.uniroma3.siw.model.Address;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless(name="customerFacade")
public class CustomerFacade {
	
	@PersistenceContext(unitName="unit-siw-project")//da ora in poi ci pensa l'application server a gestire la creazione e chiusura
	private EntityManager em;
	
	//costruttore vuoto;
	public CustomerFacade(){
	}
	
	public Customer createCustomer(String firstName, String lastName, String email, Date dateOfBirth, Date registrationDate, Address address){
		try {
			Customer customer = new Customer(firstName,lastName,email,dateOfBirth,registrationDate, address);
			em.persist(customer);
			return customer;
		} catch (Exception e) {
			return null;
		}
		
	}
	
	public Customer getCustomer(Long id){
		try {
			String stringa_query = "SELECT c FROM Customer c WHERE c.id = :id";
			Customer customer = (Customer)(em.createQuery(stringa_query).setParameter("id", id).getResultList().get(1));
			return customer;
		} 
		catch (Exception e) {
			return null;
		}
	}
	
	@SuppressWarnings("unchecked")
	public List<Customer> getAllCustomers(){
		try {
			LinkedList<Customer> customers  = (LinkedList<Customer>) em.createQuery("SELECT cs FROM Customer cs").getResultList();
			return customers;
		} catch (Exception e) {
			return null;
		}
	}
	
	public void updateCustomer(Customer customer){
		em.merge(customer);
	}
	
	public void deleteCustomer(Customer customer){
		em.remove(customer);
	}
	
	public void deleteCustomer(Long id){
		Customer customer = em.find(Customer.class, id);
		deleteCustomer(customer);
	}
}
