
package com.realdolmen.maven.clientrepository.services;

import com.realdolmen.maven.clientrepository.domain.*;
import com.realdolmen.maven.clientrepository.exceptions.NoQueryPossibleException;
import com.realdolmen.maven.clientrepository.repositories.*;
import java.util.List;

/**
 *
 * @author SDOAX36
 */
public class AddressService {
    
    private AddressRepository addressRepository;
    private PostalCodeRepository postalcoderep;
    private PostalCodeService postalService;
    
    //Insert Address (Address address)
    
    //findAddressById
     public Address findbyId(int id) throws NoQueryPossibleException
     {
        Address address = new Address();
        id = address.getPostalCode().getNumber();
        postalService.findById(id);
        address.setNumber(id);
        return address;
        
         //address.getpostalcode.getpostalcode;
         //postalservice.findbyid(address.getpostalcode.getpostalcode);
         //address.setPostalcode(postalcode)
         //return address
     }
     
    //findAllAddressForClientPerson(int id)
     
    //zoek een adres die van een bepaald persoon
    
    //findAllAddressFromClientFirm(int id)
    
}
