package org.ODSInformalEmployment.service;

import org.ODSInformalEmployment.model.MunicipalityData;

import java.util.List;

public interface MunicipalityRecordService {
    Double calculateAverageInformalityMunicipalities();
    Double calculateEstandardDeviationInformalityMunicipality();
    Integer calculateNumberPeopleInformalEmployment();
    List<MunicipalityData> sortListPercentageInformality();
    Double medianInformalEmployment();
    StringBuilder calculateAboveTheMedianInformalityMunicipality();
    StringBuilder calculateBelowMedianInformalityMunicipality();



}
