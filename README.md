package com.realdolmen.maven.clientrepository.services;

import com.realdolmen.maven.clientrepository.domain.Address;
import com.realdolmen.maven.clientrepository.exceptions.NoQueryPossibleException;
import com.realdolmen.maven.clientrepository.repositories.AddressRepository;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import static org.mockito.Mockito.*;
import org.mockito.runners.MockitoJUnitRunner;


@RunWith(MockitoJUnitRunner.class)
public class AddressServiceTest {
    
    private AddressService addressService;

    
    @Mock
    private AddressRepository addressRepository;
    
    @Before
    public void init() {
        addressService = new AddressService(addressService);
    }
   @Test
    public void findAddressByIdTestSuccess() throws NoQueryPossibleException{
        Address address = new Address();
        when(addressRepository.findById(1)).thenReturn(address);
        Address result = addressService.findAddressById(1);
        assertEquals(address, result);
        verify(addressRepository,times(1)).findById(1);
    }
    
}
