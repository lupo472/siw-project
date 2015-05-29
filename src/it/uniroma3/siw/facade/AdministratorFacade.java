package it.uniroma3.siw.facade;

import it.uniroma3.siw.model.*;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class AdministratorFacade {
	@PersistenceContext(unitName="unit-jee-es")//da ora in poi ci pensa l'application server a gestire la creazione e chiusura
	private EntityManager em;
	
	//costruttore vuoto;
	public AdministratorFacade(){
	}
	
	public User createAdministrator(String firstName, String lastName, String email, String password, Date dateOfBirth, Date registrationDate, Address address){
		try {
			User administrator = new Administrator(firstName,lastName,email, password, dateOfBirth,registrationDate, address);
			em.persist(administrator);
			return administrator;
		} catch (Exception e) {
			return null;
		}
	}
	
	public User getAdministrator(Long id){
		try {
			String stringa_query = "SELECT a FROM Administrator a WHERE a.id = :id";
			User administrator = (Administrator)(em.createQuery(stringa_query).setParameter("id", id).getResultList().get(1));
			return administrator;
		} 
		catch (Exception e) {
			return null;
		}
	}
	
	public User getAdministrator(String email){
		try {
			String stringa_query = "SELECT a FROM Administrator a WHERE a.email = :email";
			User administrator = (Administrator)(em.createQuery(stringa_query).setParameter("email", email).getResultList().get(1));
			return administrator;
		} 
		catch (Exception e) {
			return null;
		}
	}
	
	@SuppressWarnings("unchecked")
	public List<User> getAllAdministrators(){
		try {
			LinkedList<User> administrators  = (LinkedList<User>) em.createQuery("SELECT as FROM Administrator as").getResultList();
			return administrators;
		} catch (Exception e) {
			return null;
		}
	}
	
	public void updateAdministrator(User administrator){
		em.merge(administrator);
	}
	
	public void deleteAdministrator(User administrator){
		em.remove(administrator);
	}
	
	public void deleteAdministrator(Long id){
		User administrator = em.find(Administrator.class, id);
		deleteAdministrator(administrator);
	}
	
}
