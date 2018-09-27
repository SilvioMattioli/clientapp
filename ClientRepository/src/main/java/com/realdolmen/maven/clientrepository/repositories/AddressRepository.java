package com.realdolmen.maven.clientrepository.repositories;

import com.realdolmen.maven.clientrepository.domain.*;
import com.realdolmen.maven.clientrepository.exceptions.NoQueryPossibleException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;



public class AddressRepository extends AbstractRepository<Address, Integer>{

    public static final String TABLE_NAME = "address";
    public static final String KEY = "id";
    public static final String TYPE = "type";
    public static final String STREET = "street";
    public static final String NUMBER = "number";
    public static final String BOX = "box";
    public static final String POSTAL = "postal_code";
    public static final String KLANT = "klant";
    
    
    public AddressRepository() {
        super(TABLE_NAME,KEY);
    }
    
    protected AddressRepository(String url){
        super(TABLE_NAME,KEY,url);
    }

    //TODO implement
    @Override
    public Address createObject(ResultSet resultSet) {
        Address address = null;
        try
        {
            address = new Address();
            address.setTypeAddress(resultSet.getString(TYPE));
            address.setStreet(resultSet.getString(STREET));
            address.setNumber(resultSet.getInt(NUMBER));
            address.setBox(resultSet.getString(BOX));
            PostalCode postalcode = new PostalCode();
            postalcode.setNumber(resultSet.getInt(POSTAL));
            address.setPostalCode(postalcode);
            Klant klant = new Klant();
            klant.setNumber(resultSet.getInt(KLANT));
            address.setKlant(klant);
        
        } catch (SQLException ex) {
            Logger.getLogger(FirmRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        return address;
    }

    //TODO implement
    @Override
    public String getColumnString() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    //TODO implement
    @Override
    public String getValuesString(Address c) {
        if(c.getKlant() instanceof Person)
        {
            return "("+null+","+c.getKlant().getNumber()+","+null+")";
        }
        else if (c.getKlant() instanceof Firm)
        {
            return "("+null+","+c.getKlant().getNumber()+","+null+")";
        }
        return "";
            
    
    }

    //findAddressesForPersonId(int id)
//    public C findById(T id) throws NoQueryPossibleException {
//        C object = null;
//        try (Connection connection = createConnection()) {
//            PreparedStatement pstatement = connection.prepareStatement("SELECT * FROM " + tableName + " WHERE " + idName + " = " + id);
//            ResultSet resultSet = pstatement.executeQuery();
//            if (resultSet.next()) {
//                System.out.println("in resultset");
//                object = createObject(resultSet);
//            }
//        } catch (Exception e) {
//            throw new NoQueryPossibleException("Find by id " + tableName + " can not be excecuted");
//        }
//        return object;
//    }

    //findAddressesForFirmId(int id)
    
    
    
    
}
