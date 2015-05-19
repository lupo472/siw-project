package it.uniroma3.siw.model;

import java.util.Date;

public class Administrator extends User{
	
	public Administrator(){
	}
	
    public Administrator(String firstName, String lastName, String email, String password, Date dateOfBirth, Date registrationDate, Address address){
    	super(firstName, lastName, email, password, dateOfBirth, registrationDate, address);
    }
    
	@Override
	public String toString() {
		return "Administrator: "+super.toString();
	}
}
