package com.realdolmen.maven.clientrepository.services;

import com.realdolmen.maven.clientrepository.domain.Firm;
import com.realdolmen.maven.clientrepository.exceptions.NoQueryPossibleException;
import com.realdolmen.maven.clientrepository.repositories.FirmRepository;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.junit.Ignore;
import org.mockito.Mock;

import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class FirmServiceTest {
    //Object to test
    private FirmService firmService;
    //Object(s) not to test but needed for the object to test => Mocks
    @Mock
    private FirmRepository firmRepository;
    
    @Before
    public void init() {
        firmService = new FirmService(firmRepository);
    }

    @Test
    public void testFindAll() throws Exception {
        //init data to test
        List<Firm> firms = new ArrayList<>();
        when(firmRepository.findAll()).thenReturn(firms);
        //test the method
        List<Firm> result = firmService.findAll();
        //verify the results
        assertEquals(result, firms);
        verify(firmRepository,times(1)).findAll();
    }

    @Test
    public void testFindById() throws Exception {
    }

    //@Ignore
    @Test
    public void insertFirmTestSuccess() throws Exception {
    }

    @Test
    public void testRemovePerson() throws NoQueryPossibleException {
        Firm firm = new Firm();
        firm.setNumber(1);
        firmService.removeFirm(firm);
        verify(firmRepository, times(1)).deleteItem(firm.getNumber());
    }
}
