package org.ODSInformalEmployment;

import org.ODSInformalEmployment.repository.MunicipalityDataRepositoryImpl;
import org.ODSInformalEmployment.service.MunicipalityRecordService;
import org.ODSInformalEmployment.service.MunicipalityRecordServiceImpl;

import java.text.MessageFormat;

public class ApplicationRunner {
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
                        "Lista ordenada según el porcentaje de la informalidad : {0}", municipalityRecordService.sortListPercentageInformality()
                ));

        System.out.println(
                MessageFormat.format(
                        "La media de la informalidad en el municipio: {0}", municipalityRecordService.medianInformalEmployment()
                ));

        System.out.println(
                MessageFormat.format(
                        "La media superior de la informalidad en el municipio: {0}", municipalityRecordService.calculateAboveTheMedianInformalityMunicipality()
                ));

        System.out.println(
                MessageFormat.format(
                        "La media inferior de la informalidad en el municipio: {0}", municipalityRecordService.calculateBelowMedianInformalityMunicipality()
                ));

    }
}