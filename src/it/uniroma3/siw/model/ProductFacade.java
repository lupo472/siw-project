package it.uniroma3.siw.model;

import java.util.LinkedList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class ProductFacade {

	public ProductFacade(){
	}

	public Product createProduct(String code,String name,Float price,String description){
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("models-unit");
		EntityManager em = emf.createEntityManager();
		try {
			Product product = new Product(name,price,description,code);
			EntityTransaction tx = em.getTransaction();

			tx.begin();
			em.persist(product);
			tx.commit();

			em.close();
			emf.close();
			return product;
		} catch (Exception e) {
			return null;
		}

	}
	
	/*OPPURE
	 * 	public Product createProduct(String name, String code, Float price, String description) {
		Product product = new Product(name, price, description, code);
		EntityTransaction tx = entityManager.getTransaction();
		tx.begin();
		entityManager.persist(product);
		tx.commit();
		entityManager.close();
		emf.close();
		return product;
	}
	 */
	@SuppressWarnings("unchecked")
	public List<Provider> getProviders(Long id){
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("models-unit");
		EntityManager em = emf.createEntityManager();
		try {
			List<Provider> allProvider = em.createQuery("SELECT pr FROM Product AS pt,Provider AS pr WHERE pt.id=:id AND pt.providers.id = pr.id").setParameter("id",id ).getResultList();
			em.close();
			emf.close();
			return allProvider;
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
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("models-unit");
		EntityManager em = emf.createEntityManager();
		try {
			Product product = (Product)(em.createQuery("SELECT p FROM Product p WHERE p.id = :id").setParameter("id", id).getResultList().get(1));
			em.close();
			emf.close();
			return product;
		} catch (Exception e) {
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	public List<Product> getAllProducts() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("models-unit");
		EntityManager em = emf.createEntityManager();
		try {
			LinkedList<Product> products  = (LinkedList<Product>) em.createQuery("SELECT ps FROM Product ps").getResultList();
			em.close();
			emf.close();
			return products;
		} catch (Exception e) {
			return null;
		}
	}

	public void updateProduct(Product product) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("models-unit");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.merge(product);
		tx.commit();
		em.close();
		emf.close();	
	}

	private void deleteProduct(Product product) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("models-unit");
		EntityManager em = emf.createEntityManager();
		em.remove(product);
	}

	public void deleteProduct(Long id) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("models-unit");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		Product product = em.find(Product.class, id);
		deleteProduct(product);
		tx.commit();
		em.close();
		emf.close();	
	}
}


