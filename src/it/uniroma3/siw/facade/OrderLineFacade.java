package it.uniroma3.siw.facade;


import java.util.List;

import it.uniroma3.siw.model.*;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Stateless(name="orderLineFacade")
public class OrderLineFacade {
	
	@PersistenceContext(unitName="unit-siw-project")//da ora in poi ci pensa l'application server a gestire la creazione e chiusura
	private EntityManager em;
	
	public OrderLineFacade(){
	}
	
	public OrderLine createOrderLine(Float unitPrice, Integer quantity, Product product){
		try {
			OrderLine orderLine = new OrderLine(unitPrice, quantity);
			orderLine.setProduct(product);
			em.persist(orderLine);
			return orderLine;
		} catch (Exception e) {
			return null;
		}		
	}
	
	public OrderLine getOrderLine(Long id){
		Query query = this.em.createQuery("SELECT ol FROM OrderLine ol WHERE ol.id = :id");
		query.setParameter("id", id);
		try {
			OrderLine orderLine = (OrderLine)query.getSingleResult();
			return orderLine;
		} 
		catch (Exception e) {
			return null;
		}
	}
	
	@SuppressWarnings("unchecked")
	public List<OrderLine> getAllOrderLines(){
		Query query = this.em.createQuery("SELECT cs FROM Customer cs");
		try {
			List<OrderLine> orderLines  = query.getResultList();
			return orderLines;
		} catch (Exception e) {
			return null;
		}
	}
	
	public void updateOrderLine(OrderLine orderLine){
		em.merge(orderLine);
	}
	
	public void deleteOrderLine(OrderLine orderLine){
		em.remove(orderLine);
	}
	
	public void deleteOrderLine(Long id){
		OrderLine orderLine = em.find(OrderLine.class, id);
		deleteOrderLine(orderLine);
	}
}
