 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.realdolmen.maven.clientrepository.services;

import com.realdolmen.maven.clientrepository.domain.PostalCode;
import com.realdolmen.maven.clientrepository.exceptions.NoQueryPossibleException;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import com.realdolmen.maven.clientrepository.repositories.PostalCodeRepository;
import org.junit.Before;
import org.mockito.Mock;
import static org.mockito.Mockito.*;

/**
 *
 * @author SDOAX36
 */
@RunWith(MockitoJUnitRunner.class)
public class PostalCodeServiceTest {
    
    PostalCodeService postalCodeService;
    
    @Mock
    private PostalCodeRepository postalCodeRepository;
    
    @Before
    public void init() {
        postalCodeService = new PostalCodeService(postalCodeRepository);
    }
    
    public PostalCodeServiceTest() {
    }

    /**
     * Test of addPostalCode method, of class PostalCodeService.
     */
    @Test
    public void testAddPostalCode() {
    }

    /**
     * Test of findAllPostalCodes method, of class PostalCodeService.
     */
    @Test
    public void testFindAllPostalCodes() throws Exception {
    }

    /**
     * Test of findAllPostalCodesFromTheNine method, of class PostalCodeService.
     */
    @Test
    public void testFindAllPostalCodesFromTheNine() throws Exception {
    }

    /**
     * Test of findById method, of class PostalCodeService.
     */
    @Test
    public void testFindById() throws Exception {
    }
    
    @Test
    public void testRemovePostalCode() throws NoQueryPossibleException {
        PostalCode postalCode = new PostalCode();
        postalCode.setNumber(1000);
        postalCodeService.removePostalCode(postalCode);
        verify(postalCodeRepository, times(1)).deleteItem(postalCode.getNumber());        
    }

    /**
     * Test of updatePostalCode method, of class PostalCodeService.
     */
    @Test
    public void testUpdatePostalCode() {
    }
    
    @Test
    public void insertPostalCodeTest() throws Exception {
        
    }
}
