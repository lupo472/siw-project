package it.uniroma3.siw.controller;

import it.uniroma3.siw.facade.AddressFacade;
import it.uniroma3.siw.facade.ProductFacade;
import it.uniroma3.siw.facade.ProviderFacade;
import it.uniroma3.siw.model.Address;
import it.uniroma3.siw.model.Product;
import it.uniroma3.siw.model.Provider;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class UpdateCatalogController {

	/*
	 * Lato Product
	 */
	private String nameProduct;
	private Float price;
	private String description;
	private String code;
	private int inStock;

	private Product product;

	private List<Product> products;

	@EJB
	private ProductFacade productFacade;

	private List<Provider> providers = new ArrayList<Provider>();
	/*
	 * Lato Provider
	 */
	private String nameProvider;
	private String phoneNumber;
	private String email;
	private String vatin;

	private Address addressProvider;

	private List<Product> productsProvider;

	private Provider provider;

	@EJB
	private ProviderFacade providerFacade;

	/*
	 * Lato Address
	 */
	private String street;
	private String city;
	private String state;
	private int zipCode;
	private String country;

	private Address address;
	
	@EJB
	private AddressFacade addressFacade;

	public String createProduct(){
		this.product = this.productFacade.createProduct(code, nameProduct, price, description, inStock, providers);
		return "administratorHome";
	}

	public String createProvider(){
			
			this.addressProvider = new Address(street, city, state, zipCode, country);
			this.provider = new Provider(nameProvider, phoneNumber, email, vatin);
			this.provider.setAddress(addressProvider);
			this.providers.add(provider);
			
//			this.svuotaCampi();
			
			return "updateCatalog";

	}

//	private void svuotaCampi(){
//		//cancellazione dei dati inseriti dopo aver cliccato "aggiungi provider"
//		this.street = " ";
//		this.city = " ";
//		this.state = " ";
//		this.zipCode = 0;
//		this.country = " ";
//		
//		this.nameProvider = " ";
//		this.phoneNumber = " ";
//		this.email = " ";
//		this.vatin = " ";
//		
//	}
	
	
	public String getNameProduct() {
		return nameProduct;
	}

	public void setNameProduct(String nameProduct) {
		this.nameProduct = nameProduct;
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

	public int getInStock() {
		return inStock;
	}

	public void setInStock(int inStock) {
		this.inStock = inStock;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public ProductFacade getProductFacade() {
		return productFacade;
	}

	public void setProductFacade(ProductFacade productFacade) {
		this.productFacade = productFacade;
	}

	public List<Provider> getProviders() {
		return providers;
	}

	public void setProviders(List<Provider> providers) {
		this.providers = providers;
	}

	public String getNameProvider() {
		return nameProvider;
	}

	public void setNameProvider(String nameProvider) {
		this.nameProvider = nameProvider;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getVatin() {
		return vatin;
	}

	public void setVatin(String vatin) {
		this.vatin = vatin;
	}

	public Address getAddressProvider() {
		return addressProvider;
	}

	public void setAddressProvider(Address addressProvider) {
		this.addressProvider = addressProvider;
	}

	public List<Product> getProductsProvider() {
		return productsProvider;
	}

	public void setProductsProvider(List<Product> productsProvider) {
		this.productsProvider = productsProvider;
	}

	public Provider getProvider() {
		return provider;
	}

	public void setProvider(Provider provider) {
		this.provider = provider;
	}

	public ProviderFacade getProviderFacade() {
		return providerFacade;
	}

	public void setProviderFacade(ProviderFacade providerFacade) {
		this.providerFacade = providerFacade;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getZipCode() {
		return zipCode;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public AddressFacade getAddressFacade() {
		return addressFacade;
	}

	public void setAddressFacade(AddressFacade addressFacade) {
		this.addressFacade = addressFacade;
	}

}