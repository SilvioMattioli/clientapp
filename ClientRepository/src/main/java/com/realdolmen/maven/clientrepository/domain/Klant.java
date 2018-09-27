package com.realdolmen.maven.clientrepository.domain;

import java.util.ArrayList;
import java.util.List;

public class Klant {

    
    protected int number;
    private List<Address> address;
    
    public Klant() {

    }
    
    public void printAddressCard(int index){
        //do something awesome
    }
    
    public void printAddressCards(){
        //do something awesome
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int Number) {
        this.number = Number;
    }

    public List<Address> getAddress() {
        return address;
    }

    public void setAddress(List<Address> address) {
        this.address = address;
    }

    void hello() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
