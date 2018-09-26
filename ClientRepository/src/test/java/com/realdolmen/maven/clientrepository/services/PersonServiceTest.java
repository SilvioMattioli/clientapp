package com.realdolmen.maven.clientrepository.services;

import com.realdolmen.maven.clientrepository.domain.Person;
import com.realdolmen.maven.clientrepository.exceptions.NoQueryPossibleException;
import com.realdolmen.maven.clientrepository.repositories.PersonRepository;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import static org.mockito.Mockito.*;
import org.mockito.runners.MockitoJUnitRunner;

/**
 *
 * @author SDOAX36
 */
@RunWith(MockitoJUnitRunner.class)
public class PersonServiceTest {

    PersonService personService;

    @Mock
    private PersonRepository personRepository;

    @Before
    public void init() {
        personService = new PersonService(personRepository);
    }
    @Test
    public void testFindAllSucces() throws NoQueryPossibleException {
        List<Person> people = new ArrayList<>();
        when(personRepository.findAll())
                .thenReturn(people);
        List<Person> result = personService.findAll();
        
        assertEquals(people, result);
        verify(personRepository,times(1)).findAll();
        
    }

   
    @Test
    public void testFindByIdSucces() throws NoQueryPossibleException {
        Person mens = new Person();
        mens.setNumber(1);
        when(personRepository.findById(mens.getNumber()))
                .thenReturn(mens);
        Person result = personService.findById(mens.getNumber());
        assertEquals(mens, result);
        verify(personRepository,times(1)).findById(1);
    }

    @Test
    public void testRemovePerson() throws NoQueryPossibleException {
        Person person = new Person();
        person.setNumber(1);
        personService.removePerson(person);
        verify(personRepository, times(1)).deleteItem(person.getNumber());
    }

//    @Test
//    public void insertPersonTest() throws Exception {
//        Person person = new Person();
//        person.setFirstName("silvio");
//        person.setName("mattioli");
//        person.setNumber(5);
//        personService.insertPerson(person);
//        verify(personRepository,times(1)).insertItem(person);
//
//    }

}
