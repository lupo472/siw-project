package it.uniroma3.siw.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="orders")
@NamedQuery(name = "findAllOrder", query = "SELECT p FROM orders p")
public class Order {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Long id;

	@Temporal(TemporalType.TIMESTAMP)
	private Date creationTime;

	@ManyToOne(fetch=FetchType.EAGER)
	private Customer customer;

	@OneToMany(fetch=FetchType.LAZY, cascade={CascadeType.PERSIST,CascadeType.REMOVE})
	private List<OrderLine> orderlines;

	public Order(){
	}

	public Order(Date creationTime,Long id){
		this.creationTime=creationTime;
		this.id=id;
	}

	//Getters & Setters

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Date getCreationTime(){
		return this.creationTime;
	}

	public void setCreationTime(Date date){
		this.creationTime=date;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	
	public List<OrderLine> getOrderlines() {
		return orderlines;
	}

	public void setOrderlines(List<OrderLine> orderlines) {
		this.orderlines = orderlines;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((customer == null) ? 0 : customer.hashCode());
		result = prime * result
				+ ((orderlines == null) ? 0 : orderlines.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		if (customer == null) {
			if (other.customer != null)
				return false;
		} else if (!customer.equals(other.customer))
			return false;
		if (orderlines == null) {
			if (other.orderlines != null)
				return false;
		} else if (!orderlines.equals(other.orderlines))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", creationTime=" + creationTime.toString()
				+  "]";
	}


}

