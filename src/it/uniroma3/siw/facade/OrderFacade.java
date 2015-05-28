package it.uniroma3.siw.facade;


import it.uniroma3.siw.model.*;

import java.util.Date;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Stateless(name="orderFacade")
public class OrderFacade {
	@PersistenceContext(unitName="unit-siw-project")//da ora in poi ci pensa l'application server a gestire la creazione e chiusura
	private EntityManager em;
	
	public OrderFacade(){
	}
	
	public Order createOrder(Customer customer, List<OrderLine> orderlines, Date creationTime, Date closingTime){
		try {
			Order order = new Order(creationTime, customer);
			order.setClosingTime(closingTime);
			order.setOrderlines(orderlines);
			em.persist(order);
			return order;
		} catch (Exception e) {
			return null;
		}
	}
	
	public Order getOrder(Long id){
		Query query = this.em.createQuery("SELECT o FROM Order o WHERE o.id = :id");
		query.setParameter("id", id);
		try {
			Order order = (Order)query.getSingleResult();
			return order;
		} 
		catch (Exception e) {
			return null;
		}
	}
	
	@SuppressWarnings("unchecked")
	public List<Order> getAllOrders(){
		Query query = this.em.createQuery("SELECT cs FROM Customer cs");
		try {
			List<Order> orders  = query.getResultList();
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
