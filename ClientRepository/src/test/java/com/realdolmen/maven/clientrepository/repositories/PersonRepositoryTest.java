
package com.realdolmen.maven.clientrepository.repositories;

import com.realdolmen.maven.clientrepository.domain.Person;
import com.realdolmen.maven.clientrepository.exceptions.NoQueryPossibleException;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Ignore;

public class PersonRepositoryTest {
    private static String URL = "jdbc:mysql://localhost:3306/clientdbtest?autoReconnect=true&useSSL=false&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
     private PersonRepository personRepository;
     @Before
     public void init(){
         personRepository = new PersonRepository(URL);
     }
    
    @Test
    public void testFindAll() throws NoQueryPossibleException{
        PersonRepository personRepository = new PersonRepository();
        List<Person> persons = personRepository.findAll();
        assertFalse(persons.isEmpty());
    }


    @Test
    public void testInsertDeleteSucces() throws NoQueryPossibleException{  
        insert();
                  
    }

    // id wordt auto genereerd
    private void insert() throws NoQueryPossibleException{
        Person person = new Person();
        person.setName("mattioli");
        person.setFirstName("silvio");
        int result = personRepository.insertItem(person);
        assertTrue(result>0);
        System.out.println("Retrieved with id "+result);
        delete(result);
    }
        
    private void delete(int id) throws NoQueryPossibleException{
        System.out.println("Delete with id "+id);
        assertNotNull(personRepository.deleteItem(id));
    }
}
