package it.uniroma3.siw.facade;

import java.util.LinkedList;
import java.util.List;

import it.uniroma3.siw.model.*;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless(name="orderLineFacade")
public class OrderLineFacade {
	
	@PersistenceContext(unitName="unit-siw-project")//da ora in poi ci pensa l'application server a gestire la creazione e chiusura
	private EntityManager em;
	
	public OrderLineFacade(){
	}
	
	public OrderLine createOrderLine(Float unitPrice, Integer quantity){
		try {
			OrderLine orderLine = new OrderLine(unitPrice, quantity);
			em.persist(orderLine);
			return orderLine;
		} catch (Exception e) {
			return null;
		}		
	}
	
	public OrderLine getOrderLine(Long id){
		try {
			String stringa_query = "SELECT ol FROM OrderLine ol WHERE ol.id = :id";
			OrderLine orderLine = (OrderLine)(em.createQuery(stringa_query).setParameter("id", id).getResultList().get(1));
			return orderLine;
		} 
		catch (Exception e) {
			return null;
		}
	}
	
	@SuppressWarnings("unchecked")
	public List<OrderLine> getAllOrderLines(){
		try {
			LinkedList<OrderLine> orderLines  = (LinkedList<OrderLine>) em.createQuery("SELECT cs FROM Customer cs").getResultList();
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
