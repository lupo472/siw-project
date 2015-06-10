package it.uniroma3.siw.controller;

import java.util.Date;
import java.util.List;

import it.uniroma3.siw.model.*;
import it.uniroma3.siw.facade.*;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class OrderController {
	@EJB
	private OrderFacade order_facade;
	
//	@ManagedProperty(value="#{param.id}")
//	private Long id;
	
	@ManagedProperty(value="#{customerController}")
	private CustomerController customerController;
	
	private Date creationTime;
	
	private Date closingTime;
	
	private Date processingDate;
	
	private Customer customer;
	
	private Order order;
	
	private List<Order> orders;
	
	private List<OrderLine> orderlines;
	
	public String createOrder() {
		return "";
	}
	
	public String listOrders(){
		this.customer = this.customerController.getCustomer();		
		this.orders = order_facade.getAllOrdersCustomer(this.customer.getId());
		return "ElencoOrdiniCliente";
	}
	
	public String retrieveOrder(){
		this.order = order_facade.getOrder(this.order.getId());
		return "mostraOrdine";
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
