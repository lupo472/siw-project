package it.uniroma3.siw.model;


import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@NamedQuery(name = "ricercaOrdini", query = "SELECT a FROM Order a WHERE a.customer.id = :id")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable = false)
    private String firstName;
    @Column(nullable = false)
    private String lastName;
    private String email;
    @Temporal(TemporalType.DATE)
    private Date dateOfBirth;
    @Temporal(TemporalType.TIMESTAMP)
    private Date registrationDate;
    @OneToOne(fetch=FetchType.EAGER, cascade={CascadeType.PERSIST,CascadeType.REMOVE})
    private Address address;
    @OneToMany(mappedBy="customer",fetch=FetchType.LAZY)
    private List<Order> orders;

	public Customer(){
    }
    
    public Customer(String firstName, String lastName, String email, Date dateOfBirth, Date registrationDate, Address address){
    	this.firstName=firstName;
    	this.lastName=lastName;
    	this.email=email;
    	this.dateOfBirth=dateOfBirth;
    	this.registrationDate=registrationDate;
    	this.address=address;
    }
    
    //Getters & Setters
    
    
    
    public String getFirstName(){
    	return this.firstName;
    }

    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setFirstName(String setFirstName){
    	this.firstName=setFirstName;
    }
    
    public String getLastName(){
    	return this.lastName;
    }
    
    public void setLastName(String setLastName){
    	this.lastName=setLastName;
    }
    
    public String getEmail(){
    	return this.email;
    }
    
    public void setEmail(String setEmail){
    	this.email=setEmail;
    }
    
    public Date getDateOfBirth(){
    	return this.dateOfBirth;
    }

    public void setDateOfBirth(Date setDateOfBirth){
    	this.dateOfBirth=setDateOfBirth;
    }

    public Date getRegistrationDate(){
    	return this.registrationDate;
    }
    
    public void setRegistrationDate(Date setRegistrationDate){
    	this.registrationDate=setRegistrationDate;
    }
    
    public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public boolean equals(Object customer_equal){
    	Customer c = (Customer)customer_equal;
    	return this.getFirstName().equals(c.getFirstName()) && this.getLastName().equals(c.getLastName());
    }

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", email=" + email
				+ ", dateOfBirth=" + dateOfBirth + ", registrationDate="
				+ registrationDate + "]";
	}
	
	
}

