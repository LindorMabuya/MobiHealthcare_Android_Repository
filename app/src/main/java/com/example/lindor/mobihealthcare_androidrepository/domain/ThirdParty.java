package com.example.lindor.mobihealthcare_androidrepository.domain;


import java.util.List;

/**
 * Created by 213036223 on 4/17/2016.
 */
public class ThirdParty extends Provider{
    private Long id;

    public ThirdParty(Builder builder, Long id) {
        super(builder);
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
