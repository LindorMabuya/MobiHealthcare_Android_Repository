package com.example.lindor.mobihealthcare_androidrepository.factories;

import com.example.lindor.mobihealthcare_androidrepository.domain.DemographicInfo;

/**
 * Created by LILO on 2016/04/07.
 */
public interface DemographicInfoFactory
{
     DemographicInfo createDemographicInfo(Long id, int age, String sex, String maritalStatus,
                                           String occupation, double salary);
}
