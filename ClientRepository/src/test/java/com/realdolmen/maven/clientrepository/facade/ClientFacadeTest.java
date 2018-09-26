/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.realdolmen.maven.clientrepository.facade;

import com.realdolmen.maven.clientrepository.services.FirmService;
import com.realdolmen.maven.clientrepository.services.PersonService;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

/**
 *
 * @author SDOAX36
 */
@RunWith(MockitoJUnitRunner.class)
public class ClientFacadeTest {
    //object to test
    private ClientFacade clientFacade;
    //mocking
    private PersonService personService;
    private FirmService firmService;
    @Before
    public void init(){
       // clientFacade = new ClientFacade(personService,firmService);
    }
    /**
     * Test of getAllClients method, of class ClientFacade.
     */
    @Test
    public void testGetAllClients() {
    }

    /**
     * Test of findClientById method, of class ClientFacade.
     */
    @Test
    public void testFindClientById() {
    }
    
}
