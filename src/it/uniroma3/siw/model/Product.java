package it.uniroma3.siw.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQuery;
import javax.persistence.Column;

/**
 * Catalogo dei prodotti dell'azienda.
 * Pu� essere consultato da clienti non autenticati, ma i clienti che vogliono effettuare gli ordini 
 * devono essere registrati nella anagrafica dei clienti della azienda: solo i clienti identificati 
 * e autenticati possono effettuare ordini.
 */
	@Entity
	@NamedQuery(name = "findAllProducts", query = "SELECT p FROM Product p")
	public class Product {
        
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(nullable = false)
	private String name;

	private Float price;
	@Column(length = 2000)

	private String description;

	@Column(nullable = false)
	private String code;
	
	@ManyToMany(mappedBy="products", fetch=FetchType.LAZY)
	private List<Provider> providers;
	
	@Column
	private int inStock;
	
	public Product() {
    }

	public Product(String name, Float price, String description, String code, int inStock) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.code = code;
        this.inStock = inStock;
}

    //          Getters & Setters        
    
   public Long getId() {
        return id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }
	
    public boolean equals(Object obj) {
        Product product = (Product)obj;
        return this.getCode().equals(product.getCode());
    }

    public int hashCode() {
         return this.code.hashCode();
    }

    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Product"); 
        sb.append("{id=").append(id); 
        sb.append(", name='").append(name); 
        sb.append(", price=").append(price); 
        sb.append(", description='").append(description); 
        sb.append(", code='").append(code);
        sb.append("}\n");
        return sb.toString();
    }
    
    public List<Provider> getProviders() {
		return providers;
	}

	public void setProviders(List<Provider> providers) {
		this.providers = providers;
	}

	public int getInStock() {
		return inStock;
	}

	public void setInStock(int inStock) {
		this.inStock = inStock;
	}

	public void setId(Long id) {
		this.id = id;
	}

	
}