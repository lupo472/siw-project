package it.uniroma3.siw.model;


import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;


@Entity
@NamedQuery(name = "ricercaOrdini", query = "SELECT a FROM Order a WHERE a.customer.id = :id")
public class Customer extends User{
	
    @OneToMany(mappedBy="customer",fetch=FetchType.LAZY)
    private List<Order> orders;

	public Customer(){
    }
    
    public Customer(String firstName, String lastName, String email, String password, Date dateOfBirth, Date registrationDate, Address address){
    	super(firstName, lastName, email, password, dateOfBirth, registrationDate, address);
    }
    
    //Getters & Setters

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}
	
	@Override
	public String toString() {
		return "Customer: "+super.toString();
	}
}

