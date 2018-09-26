/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.realdolmen.maven.clientrepository.repositories;

import com.realdolmen.maven.clientrepository.domain.Person;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;


public class PersonRepository extends AbstractRepository<Person, Integer> {

    public static final String TABLE_NAME = "client_person";
    public static final String KEY = "client_number";
    public static final String NAME = "name";
    public static final String FIRST_NAME = "first_name";

    public PersonRepository() {
        super(TABLE_NAME, KEY);
    }
    
    //use this to test the db
    protected PersonRepository(String url){
        super(TABLE_NAME,KEY,url);
    }

    @Override
    public Person createObject(ResultSet resultSet) {
        Person person = new Person();
        try {
            person = new Person();
            person.setNumber(resultSet.getInt(KEY));
            person.setName(resultSet.getString(NAME));
            person.setFirstName(FIRST_NAME);
            return person;
        } catch (SQLException ex) {
            Logger.getLogger(PersonRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        return person;
    }

    //TODO implement
    @Override
    public String getColumnString() {
        return "("+KEY+","+NAME+","+FIRST_NAME+")";
    }

    //TODO implement
    @Override
    public String getValuesString(Person person) {
        return "("+person.getNumber()+",'"+person.getName()+"','"+person.getFirstName()+"')";
    }
}
