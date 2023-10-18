package org.ODSInformalEmployment.service;

import org.ODSInformalEmployment.model.MunicipalityData;

import java.util.List;

public interface MunicipalityRecordService {
    Double calculateAverageInformalityMunicipality();
    Double calculateVarianceInformalityMunicipality();
    Integer calculateNumberPeopleInformalEmployment();
    List<MunicipalityData> sortListPercentageInformality();
    Double medianInformalEmployment();
    StringBuilder calculateAboveTheMedianInformalityMunicipality();
    StringBuilder calculateBelowMedianInformalityMunicipality();



}
