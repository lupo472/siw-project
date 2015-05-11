package it.uniroma3.siw.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Column;

@Entity

public class Address {

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Long id;

	@Column(nullable=false)
	private String street;
	private String city;
	private String state;
	private int zipCode;
	private String country;

	public Address(){
	}

	public Address(String street, String city, String state, int zipCode,String country){
		this.street=street;
		this.city=city;
		this.state=state;
		this.zipCode=zipCode;
		this.country=country;
	}
	
	//Getter & Setters
	
	public String getStreet(){
		return this.street;
	}
	
	public void setStreet(String setStreet){
		this.street=setStreet;
	}
	
	public String getCity(){
		return this.city;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setCity(String setCity){
		this.city=setCity;
	}
	
	public String getState(){
		return this.state;
	}
	
	public void setState(String setState){
		this.state=setState;
	}

	public int getZipCode(){
		return this.zipCode;
	}

	public void setZipCode(int setZipCode){
		this.zipCode=setZipCode;
	}

	public String getCountry(){
		return this.country;
	}
	
	public void setCountry(String setCountry){
		this.country=setCountry;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		result = prime * result + ((state == null) ? 0 : state.hashCode());
		result = prime * result + ((street == null) ? 0 : street.hashCode());
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
		Address other = (Address) obj;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (country == null) {
			if (other.country != null)
				return false;
		} else if (!country.equals(other.country))
			return false;
		if (state == null) {
			if (other.state != null)
				return false;
		} else if (!state.equals(other.state))
			return false;
		if (street == null) {
			if (other.street != null)
				return false;
		} else if (!street.equals(other.street))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", street=" + street + ", city=" + city
				+ ", state=" + state + ", zipCode=" + zipCode + ", country="
				+ country + "]";
	}
	
}

