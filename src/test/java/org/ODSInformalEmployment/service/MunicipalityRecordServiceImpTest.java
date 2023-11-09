package org.ODSInformalEmployment.service;

import org.ODSInformalEmployment.repository.MunicipalityUsingFileRepositoryImpl;
import org.junit.jupiter.api.BeforeEach;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class MunicipalityRecordServiceImpTest {
    private MunicipalityRecordService municipalityRecordService;

    @BeforeEach
    void setUp(){
        this.municipalityRecordService = new MunicipalityRecordServiceImpl(new MunicipalityUsingFileRepositoryImpl());
    }

    @Test
    void calculateNumberPeopleInformalEmploymentTest() {
        this.municipalityRecordService = new MunicipalityRecordServiceImpl(new MunicipalityUsingFileRepositoryImpl());
        Integer numberPeople = this.municipalityRecordService.calculateNumberPeopleInformalEmployment();

        assertNotNull(numberPeople);
        assertEquals(
                441634,
                numberPeople); // Debido a lo valores ingresado en el
        // MunicipalityRecordServiceImpl, al realizar el promedio es 441634
    }




}
