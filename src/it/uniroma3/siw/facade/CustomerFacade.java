package it.uniroma3.siw.facade;

import javax.ejb.Stateless;

import it.uniroma3.siw.model.*;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Stateless(name="customerFacade")
public class CustomerFacade {
	
	@PersistenceContext(unitName="unit-siw-project")//da ora in poi ci pensa l'application server a gestire la creazione e chiusura
	private EntityManager em;
	
	//costruttore vuoto;
	public CustomerFacade(){
	}
	
	public Customer createCustomer(String firstName, String lastName, String email, String password, Date dateOfBirth, Date registrationDate, Address address){
		try {
			Customer customer = new Customer(firstName,lastName,email, password, dateOfBirth,registrationDate, address);
			em.persist(customer);
			return customer;
		} catch (Exception e) {
			return null;
		}
		
	}
	
	public Customer getCustomer(Long id){
		Query query = this.em.createQuery("SELECT c FROM Customer c WHERE c.id = :id");
		query.setParameter("id",id);
		try{
			Customer customer = (Customer)query.getSingleResult();
			return customer;
		} catch (Exception e){
			return null;
		}
	}
	
	public Customer getCustomer(String email){
		Query query = this.em.createQuery("SELECT c FROM Customer c WHERE c.email = :email");
		query.setParameter("email",email);
		try{
			Customer customer = (Customer)query.getSingleResult();
			return customer;
		} catch (Exception e){
			return null;
		}
	}
	
	@SuppressWarnings("unchecked")
	public List<Customer> getAllCustomers(){
		Query query = this.em.createQuery("SELECT cs FROM Customer cs");
		try {
			List<Customer> customers  = query.getResultList();
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
