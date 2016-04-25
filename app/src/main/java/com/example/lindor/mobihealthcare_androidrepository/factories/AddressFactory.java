
package com.example.lindor.mobihealthcare_androidrepository.factories;


import com.example.lindor.mobihealthcare_androidrepository.domain.Address;

/**
 * Created by LILO on 2016/04/07.
 */
public interface AddressFactory {
     Address createAddress(Long id, int streetNumber, String streetName, String town, String city, int zipCode);
}
