package it.uniroma3.siw.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Column;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="providers")
public class Provider {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Long id;
	
	@Column(nullable=false)
	private String name;
	 
	@Column(nullable=false)
	private String phoneNumber;
	private String email;

	private String vatin;
	

	@ManyToMany(mappedBy="providers", fetch=FetchType.LAZY)
	private List<Product> products;
	
	@OneToOne(fetch=FetchType.EAGER,cascade={CascadeType.PERSIST,CascadeType.REMOVE})
	@JoinColumn(name="address_fk")
	private Address address;
	
	public Provider(){
	}
	
	public Provider(String name, String phoneNumber, String email, String vatin){
		this.name=name;
		this.phoneNumber=phoneNumber;
		this.email=email;
		this.vatin=vatin;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String setEmail) {
		this.email = setEmail;
	}

	public String getVatin() {
		return vatin;
	}

	public void setVatin(String vatin) {
		this.vatin = vatin;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((vatin == null) ? 0 : vatin.hashCode());
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
		Provider other = (Provider) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (vatin == null) {
			if (other.vatin != null)
				return false;
		} else if (!vatin.equals(other.vatin))
			return false;
		return true;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	@Override
	public String toString() {
		return "Provider [id=" + id + ", name=" + name + ", phoneNumber="
				+ phoneNumber + ", email=" + email + ", vatin=" + vatin
				+ "]";
	}

	
}
