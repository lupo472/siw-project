package it.uniroma3.siw.facade;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import it.uniroma3.siw.model.*;

@Stateless(name="providerFacade")
public class ProviderFacade {

	@PersistenceContext(unitName="unit-siw-project")//da ora in poi ci pensa l'application server a gestire la creazione e chiusura
	private EntityManager em;

	public ProviderFacade(){
	}

	public Provider createProvider(String name, String phoneNumber, String email, String vatin, Address address, List<Product> products){
		try {
			Provider provider = new Provider(name, phoneNumber, email, vatin);
			provider.setAddress(address);
			if(products!=null)
				provider.setProducts(products);
			em.persist(provider);
			return provider;
		} catch (Exception e) {
			return null;
		}
	}

	public Provider getProvider(Long id){
		Query stringa_query = this.em.createQuery("SELECT p FROM Provider p WHERE p.id = :id");
		stringa_query.setParameter("id", id);
		try {
			Provider provider = (Provider)stringa_query.getSingleResult();//se rompe cambia in getResultList
			return provider;
		} catch (Exception e) {
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	public List<Provider> getAllProviders() {
		Query query = this.em.createQuery("SELECT ps FROM Provider ps");
		try {
			List<Provider> providers  = query.getResultList();
			return providers;
		} catch (Exception e) {
			return null;
		}
	}


	public void updateProvider(Provider provider) {
		em.merge(provider);	
	}

	private void deleteProvider(Provider provider) {
		em.remove(provider);
	}

	public void deleteProvider(Long id) {
		Provider provider = em.find(Provider.class, id);
		deleteProvider(provider);
	}
}
