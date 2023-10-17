package org.example;

import org.example.model.MunicipalityData;
import org.example.repository.MunicipalityDataRepositoryImpl;
import org.example.service.MunicipalityRecordService;
import org.example.service.MunicipalityRecordServiceImpl;

import java.text.MessageFormat;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        MunicipalityRecordService municipalityRecordService =
                new MunicipalityRecordServiceImpl(new MunicipalityDataRepositoryImpl());

        System.out.println(
                MessageFormat.format(
                        "Número de personas informales: {0}", municipalityRecordService.calculateNumberPeopleInformalEmployment()
                )
        );

        System.out.println(
                MessageFormat.format(
                "El promedio de la informalidad en el municipio es: {0}", municipalityRecordService.calculateAverageInformalityMunicipality()
        ));

        System.out.println(
                MessageFormat.format(
                "La varianza de la informalidad en el municipio es: {0}", municipalityRecordService.calculateVarianceInformalityMunicipality()
        ));

        System.out.println(
                MessageFormat.format(
                        "Lista de porcentajes de la informalidad en el municipio: {0}", municipalityRecordService.sortListPercentageInformality()
                ));

        System.out.println(
                MessageFormat.format(
                        "La media de la informalidad en el municipio: {0}", municipalityRecordService.medianInformalEmployment()
                ));

    }
}