package org.example.service;

import org.example.model.MunicipalityData;

import java.util.List;

public interface MunicipalityRecordService {
    Double calculateAverageInformalityMunicipality();
    Double calculateVarianceInformalityMunicipality();
    Integer calculateNumberPeopleInformalEmployment();
    List<MunicipalityData> sortListPercentageInformality();
    Double medianInformalEmployment();

}
