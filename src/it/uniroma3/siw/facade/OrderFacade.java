package it.uniroma3.siw.facade;


import it.uniroma3.siw.model.Order;


import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless(name="orderFacade")
public class OrderFacade {
	@PersistenceContext(unitName="unit-jee-es")//da ora in poi ci pensa l'application server a gestire la creazione e chiusura
	private EntityManager em;
	
	public OrderFacade(){
	}
	
	public Order createOrder(Date creationTime, Long id){
		try {
			Order order = new Order(creationTime, id);
			em.persist(order);
			return order;
		} catch (Exception e) {
			return null;
		}
	}
	
	public Order getOrder(Long id){
		try {
			String stringa_query = "SELECT o FROM Order o WHERE o.id = :id";
			Order order = (Order)(em.createQuery(stringa_query).setParameter("id", id).getResultList().get(1));
			return order;
		} 
		catch (Exception e) {
			return null;
		}
	}
	
	@SuppressWarnings("unchecked")
	public List<Order> getAllOrders(){
		try {
			LinkedList<Order> orders  = (LinkedList<Order>) em.createQuery("SELECT cs FROM Customer cs").getResultList();
			return orders;
		} catch (Exception e) {
			return null;
		}
	}
	
	public void updateOrder(Order order){
		em.merge(order);
	}
	
	public void deleteOrder(Order order){
		em.remove(order);
	}
	
	public void deleteOrder(Long id){
		Order order = em.find(Order.class, id);
		deleteOrder(order);
	}
}
