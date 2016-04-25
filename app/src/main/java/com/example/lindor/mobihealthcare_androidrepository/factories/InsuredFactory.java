package com.example.lindor.mobihealthcare_androidrepository.factories;





import com.example.lindor.mobihealthcare_androidrepository.domain.DemographicInfo;
import com.example.lindor.mobihealthcare_androidrepository.domain.Insured;
import com.example.lindor.mobihealthcare_androidrepository.domain.Physician;
import com.example.lindor.mobihealthcare_androidrepository.domain.Plan;

import java.util.List;

/**
 * Created by 213036223 on 4/17/2016.
 */
public interface InsuredFactory {
    Insured createInsured(List<Plan> plans, List<DemographicInfo> demographicInfos, List<Physician> physicians);
}
