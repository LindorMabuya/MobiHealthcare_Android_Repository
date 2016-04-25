
package com.example.lindor.mobihealthcare_androidrepository.domain;


import java.util.List;

/**
 * Created by 213036223 on 4/17/2016.
 */
public class Hospital extends Provider{
    private String hospitalName;

    public Hospital(Builder builder, String hospitalName) {
        super(builder);
        this.hospitalName = hospitalName;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    @Override
    public List<DemographicInfo> getDemographicInfoList() {
        return super.getDemographicInfoList();
    }

    @Override
    public Payer getPayer() {
        return super.getPayer();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
