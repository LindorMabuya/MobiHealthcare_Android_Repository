package com.example.lindor.mobihealthcare_androidrepository.factories;


import com.example.lindor.mobihealthcare_androidrepository.domain.BenefitSet;
import com.example.lindor.mobihealthcare_androidrepository.domain.Deductible;
import com.example.lindor.mobihealthcare_androidrepository.domain.Payer;
import com.example.lindor.mobihealthcare_androidrepository.domain.Plan;

/**
 * Created by LILO on 2016/04/08.
 */
public interface PlanFactory {
    Plan createPlan(Deductible deductible, BenefitSet benefitSet, Payer payer);
}
