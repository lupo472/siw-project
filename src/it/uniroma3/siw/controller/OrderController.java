package it.uniroma3.siw.controller;

import java.util.Date;
import java.util.List;

import it.uniroma3.siw.model.*;
import it.uniroma3.siw.facade.*;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

@ManagedBean
public class OrderController {
	@EJB
	private OrderFacade order_facade;
	
	@ManagedProperty(value="#{param.id}")
	private Long id;
	
	private Date creationTime;
	
	private Order order;
	
	private List<Order> orders;
	
	public String createOrder() {
		this.order = order_facade.createOrder(creationTime, id);
		return "mostraOrdine";
	}
	
	public String listOrders(){
		this.orders = order_facade.getAllOrders();
		return "listaOrdini";
	}
	
	public String retrieveOrder(){
		this.order = order_facade.getOrder(id);
		return "mostraOrdine";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getCreationTime() {
		return creationTime;
	}

	public void setCreationTime(Date creationTime) {
		this.creationTime = creationTime;
	}

	public List<Order> getOrders() {
		return orders;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}
	
	
	
}
