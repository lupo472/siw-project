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
@SessionScoped
public class OrderController {
	@EJB
	private OrderFacade order_facade;
	
	@ManagedProperty(value="#{param.id}")
	private Long id;
	
	private Date creationTime;
	
	private Date closingTime;
	
	private Date processingDate;
	
	private Customer customer;
	
	private Order order;
	
	private List<Order> orders;
	
	private List<OrderLine> orderlines;
	
	public String createOrder() {
//		this.orderlines = this.orderLineController.getOrderLines();
//		this.customer = (Customer)this.customerController.getCustomer();
//		this.closingTime = new Date();
//		//manca come fare il CreationTime
//		this.order = order_facade.createOrder(customer, orderlines, creationTime, closingTime);
//		
//		return "mostraOrdine";
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

	public Date getClosingTime() {
		return closingTime;
	}

	public void setClosingTime(Date closingTime) {
		this.closingTime = closingTime;
	}

	public Date getProcessingDate() {
		return processingDate;
	}

	public void setProcessingDate(Date processingDate) {
		this.processingDate = processingDate;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public List<OrderLine> getOrderlines() {
		return orderlines;
	}

	public void setOrderlines(List<OrderLine> orderlines) {
		this.orderlines = orderlines;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}
}
