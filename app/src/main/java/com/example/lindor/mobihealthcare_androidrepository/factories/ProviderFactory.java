package com.example.lindor.mobihealthcare_androidrepository.factories;





import com.example.lindor.mobihealthcare_androidrepository.domain.DemographicInfo;
import com.example.lindor.mobihealthcare_androidrepository.domain.Payer;
import com.example.lindor.mobihealthcare_androidrepository.domain.Provider;

import java.util.List;

/**
 * Created by 213036223 on 4/17/2016.
 */
public interface ProviderFactory {
    Provider createProvider( Long id, List<DemographicInfo> demographicInfos, Payer payer);
}
