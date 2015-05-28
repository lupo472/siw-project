package it.uniroma3.siw.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


public abstract class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable = false)
    private String firstName;
    @Column(nullable = false)
    private String lastName;
    private String email;
    private String password;
    @Temporal(TemporalType.DATE)
    private Date dateOfBirth;
    @Temporal(TemporalType.TIMESTAMP)
    private Date registrationDate;
    @OneToOne(fetch=FetchType.EAGER, cascade={CascadeType.PERSIST,CascadeType.REMOVE})
    private Address address;
    
    public User(){
    }
    
    public User(String firstName, String lastName, String email, String password, Date dateOfBirth, Date registrationDate, Address address){
    	this.firstName=firstName;
    	this.lastName=lastName;
    	this.email=email;
    	this.password=password;
    	this.dateOfBirth=dateOfBirth;
    	this.registrationDate=registrationDate;
    	this.address=address;
    }
    
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

    public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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

	public boolean equals(Object user_equal){
    	Customer c = (Customer)user_equal;
    	return this.getFirstName().equals(c.getFirstName()) && this.getLastName().equals(c.getLastName());
    }
    
	@Override
	public String toString() {
		return "[id=" + id + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", email=" + email
				+ ", dateOfBirth=" + dateOfBirth + ", registrationDate="
				+ registrationDate + "]";
	}
}
