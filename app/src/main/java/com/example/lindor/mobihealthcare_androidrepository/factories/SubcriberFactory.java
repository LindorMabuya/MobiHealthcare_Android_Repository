package com.example.lindor.mobihealthcare_androidrepository.factories;


import com.example.lindor.mobihealthcare_androidrepository.domain.Dependent;
import com.example.lindor.mobihealthcare_androidrepository.domain.Subscriber;

/**
 * Created by 213036223 on 4/17/2016.
 */
public interface SubcriberFactory {
    Subscriber createSubscriber(Dependent dependent);
}
