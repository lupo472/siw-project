package it.uniroma3.siw.controller;

import java.util.List;

import it.uniroma3.siw.facade.OrderLineFacade;
import it.uniroma3.siw.model.*;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;


@ManagedBean
@SessionScoped
public class OrderLineController {
	@EJB
	private OrderLineFacade orderLine_facade;
	
	@ManagedProperty(value="#{param.id}")
	private Long id;
	
	private Float unitPrice;
	
	private Integer quantity;
	
	private OrderLine orderLine;
	
	private List<OrderLine> orderLines;

	private Product product;
	
	public String listOrderLines(){
		this.orderLines = orderLine_facade.getAllOrderLines();
		return "listaLineeOrdine";
	}
	
	public String retrieveOrderLine(){
		this.orderLine = orderLine_facade.getOrderLine(id);
		return "mostraLineaOrdine";
	}

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

	public OrderLineFacade getOrderLine_facade() {
		return orderLine_facade;
	}

	public void setOrderLine_facade(OrderLineFacade orderLine_facade) {
		this.orderLine_facade = orderLine_facade;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
}
