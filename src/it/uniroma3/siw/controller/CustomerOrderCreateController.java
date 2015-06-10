package it.uniroma3.siw.controller;

import it.uniroma3.siw.facade.OrderFacade;
import it.uniroma3.siw.facade.OrderLineFacade;
import it.uniroma3.siw.facade.ProductFacade;
import it.uniroma3.siw.model.Customer;
import it.uniroma3.siw.model.Order;
import it.uniroma3.siw.model.OrderLine;
import it.uniroma3.siw.model.Product;

import java.util.Date;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class CustomerOrderCreateController {
	
	@ManagedProperty(value="#{customerController}")
	private CustomerController customerController;
	
	/*
	 * Lato OrderLine
	 */
	@EJB
	private OrderLineFacade orderLine_facade;
	
//	@ManagedProperty(value="#{param.id}")
//	private Long idOL;
	
	private Float unitPrice;
	
	private Integer quantity;
	
	private OrderLine orderLine;
	
	private List<OrderLine> orderLines;

	private Product productOrderLine;
	
	/*
	 * Lato Order
	 */
	
	@EJB
	private OrderFacade order_facade;
//	
//	@ManagedProperty(value="#{param.id}")
//	private Long idO;
	
	private Date creationTime;
	
	private Date closingTime;
	
	private Date processingDate;
	
	private Customer customer;
	
	private Order order;
	
	private List<Order> orders;
	
	private List<OrderLine> orderlinesOrder;
	
	/*
	 * Lato Product
	 */
	@EJB
	private ProductFacade product_facade;
	
//	@ManagedProperty(value="#{param.id}")
//	private Long idP;
//	
	private String name;
	private Float price;
	private String description;
	private String code;
	
	private Product productFound;
	
	private List<Product> products;
	
	public String createOrderLine(){
		this.productFound = this.product_facade.getProduct(code);
		this.unitPrice  = this.productFound.getPrice();
		this.orderLine = this.orderLine_facade.createOrderLine(unitPrice, quantity, productFound);
		this.orderLines.add(this.orderLine);
		return "createOrder";
	}
	
	public String createOrder(){
		this.customer = this.customerController.getCustomer();
		this.order = this.order_facade.createOrder(customer, orderLines, creationTime, new Date());
		return "customerHome";
	}

	public CustomerController getCustomerController() {
		return customerController;
	}

	public void setCustomerController(CustomerController customerController) {
		this.customerController = customerController;
	}

	public OrderLineFacade getOrderLine_facade() {
		return orderLine_facade;
	}

	public void setOrderLine_facade(OrderLineFacade orderLine_facade) {
		this.orderLine_facade = orderLine_facade;
	}

//	public Long getIdOL() {
//		return idOL;
//	}
//
//	public void setIdOL(Long idOL) {
//		this.idOL = idOL;
//	}

	public Float getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(Float unitPrice) {
		this.unitPrice = unitPrice;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public OrderLine getOrderLine() {
		return orderLine;
	}

	public void setOrderLine(OrderLine orderLine) {
		this.orderLine = orderLine;
	}

	public List<OrderLine> getOrderLines() {
		return orderLines;
	}

	public void setOrderLines(List<OrderLine> orderLines) {
		this.orderLines = orderLines;
	}

	public Product getProductOrderLine() {
		return productOrderLine;
	}

	public void setProductOrderLine(Product productOrderLine) {
		this.productOrderLine = productOrderLine;
	}

	public OrderFacade getOrder_facade() {
		return order_facade;
	}

	public void setOrder_facade(OrderFacade order_facade) {
		this.order_facade = order_facade;
	}

//	public Long getIdO() {
//		return idO;
//	}
//
//	public void setIdO(Long idO) {
//		this.idO = idO;
//	}

	public Date getCreationTime() {
		return creationTime;
	}

	public void setCreationTime(Date creationTime) {
		this.creationTime = creationTime;
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

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

	public List<OrderLine> getOrderlinesOrder() {
		return orderlinesOrder;
	}

	public void setOrderlinesOrder(List<OrderLine> orderlinesOrder) {
		this.orderlinesOrder = orderlinesOrder;
	}

	public ProductFacade getProduct_facade() {
		return product_facade;
	}

	public void setProduct_facade(ProductFacade product_facade) {
		this.product_facade = product_facade;
	}

//	public Long getIdP() {
//		return idP;
//	}
//
//	public void setIdP(Long idP) {
//		this.idP = idP;
//	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Product getProductFound() {
		return productFound;
	}

	public void setProductFound(Product productFound) {
		this.productFound = productFound;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}
	
}
