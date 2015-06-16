package it.uniroma3.siw.controller;

import java.util.*;

import it.uniroma3.siw.model.*;
import it.uniroma3.siw.facade.*;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;

@ManagedBean
public class OrderController {
	@EJB
	private OrderFacade order_facade;
	
	@EJB
	private ProductFacade product_facade;
	
	@ManagedProperty(value="#{param.id}")
	private Long id;
	
	@ManagedProperty(value="#{customerController}")
	private CustomerController customerController;
	
	private Date creationTime;
	
	private Date closingTime;
	
	private Date processingDate;
	
	private Customer customer;
	
	private Order order;
	
	private List<Order> orders;
		
	private List<OrderLine> orderlines;
	
	@PostConstruct
	public void init(){
		this.processingDate=null;
	}
	
	public String createOrder() {
		return "";
	}
	
	public String listOrders(){
		this.customer = this.customerController.getCustomer();		
		this.orders = order_facade.getAllOrdersCustomer(this.customer.getId());
		if(this.orders==null){
			return "customerHome";
		}
		return "ElencoOrdiniCliente";
	}
	
	public String discardProcessOrder(){
		this.order=null;
		this.processingDate=null;
		this.orderlines=null;
		return "administratorHome";
	}
	
	public String processOrder(){
		if(this.processingDate!=null){
			return "processOrder";
		}
		this.order = order_facade.getOrder(id);
		if(this.order==null){
			return "erroreOrdineNonTrovato";
		}
		if(this.checkOrderLines(this.order)){
			this.updateProductsQuantity();
			Date d = new Date();
			this.processingDate=d;
			this.order.setProcessingDate(d);
			this.order_facade.updateOrder(this.order);
			return "processedOrder";
		}
		return "suspendedOrder";
	}
	
	private boolean checkOrderLines(Order order){
		this.orderlines = order.getOrderlines();
		for(OrderLine o : this.orderlines){
			if(o.getProduct().getInStock()<o.getQuantity()){
				return false;
			}
		}
		return true;
	}
	
	private void updateProductsQuantity(){
		for(OrderLine o : this.orderlines){
			Product p = o.getProduct();
			int newquantity = p.getInStock()-o.getQuantity();
			p.setInStock(newquantity);
			this.product_facade.updateProduct(p);
		}		
		return;
	}
	
	public String retrieveOrder(){
		try{
			this.order = order_facade.getOrder(id);
			this.orderlines=(ArrayList<OrderLine>)this.order.getOrderlines();
			return "mostraOrdine";
		}
		catch(NullPointerException e){
			return "ElencoOrdiniCliente";
		}
	}
	
	public String retrieveCustomer(){
		try{
			this.order = order_facade.getOrder(id);
			this.customer = this.order.getCustomer();
			return "mostraCliente";
		}
		catch(NullPointerException e){
			return "erroreClienteNonTrovato";
		}		
	}
	
	public String discardRetrieveCustomer(){
		this.order=null;
		this.customer=null;
		return "administratorHome";
	}
	
	public String retrieveAllOrders(){
		this.orders=order_facade.getAllOrders();
		
		if(this.orders==null){
			System.out.println("NULLA");
			return "processOrder";
		}
		System.out.println("NON NULLA");
		return "processOrder";
	}
	
	private void retrieveAllOrdersP(){
		this.orders=order_facade.getAllOrders();
		return;
	}
	
	public String retrieveAllNotProcessedOrders(){
		List<Order> allOrders = order_facade.getAllOrders();
		if(allOrders==null || allOrders.isEmpty()){
			return "erroreZeroOrdini";
		}
		int contaOrdiniNonProcessati=0;
		for(Order o : allOrders){
			if(o.getProcessingDate()==null){
				contaOrdiniNonProcessati++;
			}
		}
		if(contaOrdiniNonProcessati==0){
			return "erroreZeroOrdini";
		}
		List<Order> notProcessedOrders = new ArrayList<Order>();
		for(Order o : allOrders){
			if(o.getProcessingDate()==null){
				notProcessedOrders.add(o);
			}
		}
		this.orders = notProcessedOrders;
		return "processOrder";
	}
	
	public String insertIdOrder(){
		retrieveAllOrdersP();
		return "inserisciIdOrdine";
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

	public OrderFacade getOrder_facade() {
		return order_facade;
	}

	public void setOrder_facade(OrderFacade order_facade) {
		this.order_facade = order_facade;
	}

	public CustomerController getCustomerController() {
		return customerController;
	}

	public void setCustomerController(CustomerController customerController) {
		this.customerController = customerController;
	}
}
