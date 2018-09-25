
package com.realdolmen.maven.clientrepository.services;

import com.realdolmen.maven.clientrepository.domain.*;
import com.realdolmen.maven.clientrepository.exceptions.NoQueryPossibleException;
import com.realdolmen.maven.clientrepository.repositories.*;

/**
 *
 * @author SDOAX36
 */
public class AddressService {
    
    private AddressRepository addressRepository;
    private PostalCodeRepository postalcoderep;
    
    //Insert Address (Address address)
    
    //findAddressById
     public Address findbyId(int id) throws NoQueryPossibleException
     {
         return addressRepository.findById(id);
     }
     
    //findAllAddressForClientPerson(int id)
     
    //zoek een adres die van een bepaald persoon
    
    //findAllAddressFromClientFirm(int id)
    
}
