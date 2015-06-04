package it.uniroma3.siw.facade;

import it.uniroma3.siw.model.Product;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Stateless
public class ProductFacade {
	
	@PersistenceContext(unitName="unit-siw-project")//da ora in poi ci pensa l'application server a gestire la creazione e chiusura
	private EntityManager em;

	public ProductFacade(){
	}

	public Product createProduct(String code,String name,Float price,String description){
		try {
			Product product = new Product(name,price,description,code);
			em.persist(product);
			return product;
		} catch (Exception e) {
			return null;
		}

	}

	/*OPPURE 
	 * 	public List<Product> getAllProducts() {
        CriteriaQuery<Product> cq = entityManager.getCriteriaBuilder().createQuery(Product.class);
        cq.select(cq.from(Product.class));
        List<Product> products = entityManager.createQuery(cq).getResultList();
		entityManager.close();
		emf.close();
		return products;
	}

	 */
	public Product getProduct(Long id) {
		Query stringa_query = this.em.createQuery("SELECT p FROM Product p WHERE p.id = :id");
		stringa_query.setParameter("id", id);
		try {
			Product product = (Product)stringa_query.getSingleResult();//se rompe cambia in getResultList
			return product;
		} catch (Exception e) {
			return null;
		}
	}
	
	public Product getProduct(String code){
		Query query = this.em.createQuery("SELECT p FROM Product p WHERE p.code = :code");
		query.setParameter("code",code);
		try{
			Product product = (Product)query.getSingleResult();
			return product;
		} catch (Exception e){
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	public List<Product> getAllProducts() {
		Query query = this.em.createQuery("SELECT ps FROM Product ps");
		try {
			List<Product> products  = query.getResultList();
			return products;
		} catch (Exception e) {
			return null;
		}
	}
	
//	public List<Product> getAllProducts() {
//        CriteriaQuery<Product> cq = em.getCriteriaBuilder().createQuery(Product.class);
//        cq.select(cq.from(Product.class));
//        List<Product> products = em.createQuery(cq).getResultList();
//		return products;
//	}
//	

	public void updateProduct(Product product) {
		em.merge(product);	
	}

	private void deleteProduct(Product product) {
		em.remove(product);
	}

	public void deleteProduct(Long id) {
		Product product = em.find(Product.class, id);
		deleteProduct(product);
	}
}


