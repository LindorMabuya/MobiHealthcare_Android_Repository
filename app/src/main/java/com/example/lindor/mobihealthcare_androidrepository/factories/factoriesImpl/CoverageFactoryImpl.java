package com.example.lindor.mobihealthcare_androidrepository.factories.factoriesImpl;


import com.example.lindor.mobihealthcare_androidrepository.domain.Coverage;
import com.example.lindor.mobihealthcare_androidrepository.factories.CoverageFactory;

/**
 * Created by LILO on 2016/04/08.
 */
public class CoverageFactoryImpl implements CoverageFactory {
    private static CoverageFactoryImpl coverageFactory = null;

    public CoverageFactoryImpl() {
    }

    public static  CoverageFactoryImpl getInstance()
    {
        if(coverageFactory == null)
            coverageFactory = new CoverageFactoryImpl();
        return coverageFactory;
    }

    public Coverage createCoverage() {
        Coverage coverage = new Coverage();
        return coverage;
    }
}
