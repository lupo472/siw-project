package it.uniroma3.siw.facade;

import it.uniroma3.siw.model.*;

import java.util.Date;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Stateless(name="administratorFacade")
public class AdministratorFacade {
	@PersistenceContext(unitName="unit-siw-project")//da ora in poi ci pensa l'application server a gestire la creazione e chiusura
	private EntityManager em;
	
	//costruttore vuoto;
	public AdministratorFacade(){
	}
	
	public Administrator createAdministrator(String firstName, String lastName, String email, String password, Date dateOfBirth, Date registrationDate, Address address){
		try {
			Administrator administrator = new Administrator(firstName,lastName,email, password, dateOfBirth,registrationDate, address);
			em.persist(administrator);
			return administrator;
		} catch (Exception e) {
			return null;
		}
	}
	
	public Administrator getAdministrator(Long id){
		Query query = this.em.createQuery("SELECT a FROM Administrator a WHERE a.id = :id");
		query.setParameter("id",id);
		try{
			Administrator administrator = (Administrator)query.getSingleResult();
			return administrator;
		} catch (Exception e){
			return null;
		}
	}
	
	public Administrator getAdministrator(String email){
		Query query = this.em.createQuery("SELECT a FROM Administrator a WHERE a.id = :id");
		query.setParameter("email",email);
		try{
			Administrator administrator = (Administrator)query.getSingleResult();
			return administrator;
		} catch (Exception e){
			return null;
		}
	}
	
	@SuppressWarnings("unchecked")
	public List<Administrator> getAllAdministrators(){
		Query query = this.em.createQuery("SELECT a FROM Administrator a");
		try{
			List<Administrator> administrator = query.getResultList();
			return administrator;
		} catch (Exception e){
			return null;
		}
	}
	
	public void updateAdministrator(Administrator administrator){
		em.merge(administrator);
	}
	
	public void deleteAdministrator(Administrator administrator){
		em.remove(administrator);
	}
	
	public void deleteAdministrator(Long id){
		Administrator administrator = em.find(Administrator.class, id);
		deleteAdministrator(administrator);
	}
	
}
