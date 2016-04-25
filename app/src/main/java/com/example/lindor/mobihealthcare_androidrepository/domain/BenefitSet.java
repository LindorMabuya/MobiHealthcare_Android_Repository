package com.example.lindor.mobihealthcare_androidrepository.domain;

import java.io.Serializable;

/**
 * Created by 213036223 on 4/17/2016.
 */
public class BenefitSet implements Serializable{
    private Service service;

    private BenefitSet(){

    }

    public BenefitSet(Service service) {
        this.service = service;
    }


    public Service getService() {
        return service;
    }



}
