package org.ODSInformalEmployment.service;

import org.ODSInformalEmployment.model.MunicipalityData;
import org.ODSInformalEmployment.repository.MunicipalityDataRepository;
import org.ODSInformalEmployment.repository.MunicipalityDataRepositoryImpl;
import org.junit.jupiter.api.BeforeEach;
import org.testng.annotations.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class MunicipalityRecordServiceImpTest {
    private MunicipalityRecordService municipalityRecordService;

    @BeforeEach
    void setUp(){
        this.municipalityRecordService = new MunicipalityRecordServiceImpl(new MunicipalityDataRepositoryImpl());
    }

    @Test
    void calculateNumberPeopleInformalEmploymentTest() {
        this.municipalityRecordService = new MunicipalityRecordServiceImpl(new MunicipalityDataRepositoryImpl());
        Integer numberPeople = this.municipalityRecordService.calculateNumberPeopleInformalEmployment();

        assertNotNull(numberPeople);
        assertEquals(
                399369,
                numberPeople); // Debido a lo valores ingresado en el
        // MunicipalityRecordServiceImpl, al realizar el promedio es 399369
    }




}
