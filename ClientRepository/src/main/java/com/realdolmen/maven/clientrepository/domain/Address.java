
package com.realdolmen.maven.clientrepository.domain;

public class Address {
    
    private String typeAddress;
    private String street;
    private int number;
    private String box;
    private PostalCode postalCode;
    private Klant klant;
    
    public Address() {
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public PostalCode getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(PostalCode postalCode) {
        this.postalCode = postalCode;
    }
    
    public String getTypeAddress() {
        return typeAddress;
    }

    public void setTypeAddress(String typeAddress) {
        this.typeAddress = typeAddress;
    }

    public Klant getKlant() {
        return klant;
    }

    public void setKlant(Klant klant) {
        this.klant = klant;
    }

    public String getBox() {
        return box;
    }

    public void setBox(String box) {
        this.box = box;
    }
    
    
    
    
    
   
    @Override
    public String toString() {
        String card = "******************************\n"
                + this.street +" "+this.number+"\n"
                + this.postalCode.getNumber()+" "+this.postalCode.getCity()+
                "*******************************\n";
        return card;
    }
    
}
