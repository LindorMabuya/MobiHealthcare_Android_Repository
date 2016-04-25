package com.example.lindor.mobihealthcare_androidrepository.factories.factoriesImpl;


import com.example.lindor.mobihealthcare_androidrepository.domain.Address;
import com.example.lindor.mobihealthcare_androidrepository.factories.AddressFactory;

/**
 * Created by LILO on 2016/04/07.
 */
public class AddressFactoryImpl implements AddressFactory {

    private static AddressFactoryImpl addressFactory = null;

    public AddressFactoryImpl() {
    }

    public static  AddressFactoryImpl getInstance()
    {
        if(addressFactory == null)
            addressFactory = new AddressFactoryImpl();
        return addressFactory;
    }

    public Address createAddress(Long id, int streetNumber, String streetName, String town, String city, int zipCode) {
        Address address = new Address.Builder().id(id).streetNumber(streetNumber).streetName(streetName).town(town)
                                    .city(city).zipCode(zipCode).build();
        return address;
    }
}
