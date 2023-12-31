package org.ODSInformalEmployment;

import org.ODSInformalEmployment.repository.MunicipalityUsingFileRepositoryImpl;
import org.ODSInformalEmployment.service.MunicipalityRecordService;
import org.ODSInformalEmployment.service.MunicipalityRecordServiceImpl;

import java.text.MessageFormat;

public class ApplicationRunner {
    public static void main(String[] args) {

        MunicipalityRecordService municipalityRecordService =
                new MunicipalityRecordServiceImpl(new MunicipalityUsingFileRepositoryImpl());

        System.out.println(
                MessageFormat.format(
                        "the average number of people with informal employment is: {0}", municipalityRecordService.calculateNumberPeopleInformalEmployment()
                )
        );

        System.out.println(
                MessageFormat.format(
                        """
                                \nUsing a sample of municipalities.txt in the south of Antioquia\s
                                with respect to the percentage of informal employment,\s
                                a Point Estimator of the average is obtained, from which we can infer\s
                                that the approximate average of the percentage of informal employment\s
                                in the southern area of Antioquia is: {0}""", municipalityRecordService.calculateAverageInformalityMunicipalities()
        ));

        System.out.println(
                MessageFormat.format(
                        """
                                \nCalculating the standard deviation\s
                                to observe the dispersion of the percentages of informal employment\s
                                with respect to the average gives us a value of: {0}""", municipalityRecordService.calculateEstandardDeviationInformalityMunicipality()
        ));


        System.out.println(
                MessageFormat.format(
                        "\nThe median percentage of informality in the sample area of Antioquia is: {0}", municipalityRecordService.medianInformalEmployment()
                ));

        System.out.println(
                MessageFormat.format(
                        "\nMunicipalities with the highest informality rate: {0}", municipalityRecordService.calculateAboveTheMedianInformalityMunicipality(), " They affect economic growth in Antioquia to a greater extent"
                ));

        System.out.println(
                MessageFormat.format(
                        "\nMunicipalities with the lowest informality rate: {0}", municipalityRecordService.calculateBelowMedianInformalityMunicipality()
                ));

        System.out.println("Municipalities with greater informality ");
        System.out.println(municipalityRecordService.sortListPercentageInformality().get(municipalityRecordService.sortListPercentageInformality().size()-1).name()+", "+municipalityRecordService.sortListPercentageInformality().get(municipalityRecordService.sortListPercentageInformality().size()-1).informalityPercentage()+"%");
        System.out.println(municipalityRecordService.sortListPercentageInformality().get(municipalityRecordService.sortListPercentageInformality().size()-2).name()+", "+municipalityRecordService.sortListPercentageInformality().get(municipalityRecordService.sortListPercentageInformality().size()-2).informalityPercentage()+"%");
        System.out.println(municipalityRecordService.sortListPercentageInformality().get(municipalityRecordService.sortListPercentageInformality().size()-3).name()+", "+municipalityRecordService.sortListPercentageInformality().get(municipalityRecordService.sortListPercentageInformality().size()-3).informalityPercentage()+"%");
        System.out.println(municipalityRecordService.sortListPercentageInformality().get(municipalityRecordService.sortListPercentageInformality().size()-4).name()+", "+municipalityRecordService.sortListPercentageInformality().get(municipalityRecordService.sortListPercentageInformality().size()-4).informalityPercentage()+"%");
        System.out.println("\nMunicipality with the least informality: "+ municipalityRecordService.sortListPercentageInformality().get(0).name()+", "+municipalityRecordService.sortListPercentageInformality().get(0).informalityPercentage()+"%");
        System.out.println("""
                           \nMunicipalities with a higher rate of informality can  
                           evaluate models of municipalities.txt with less informality to apply possible 
                           successful business models in other regions or the world to generate 
                           quality jobs and economic growth in the region.""");


        System.out.println("Municipalities with greater informality ");
        System.out.println(municipalityRecordService.sortListPercentageInformality().get(municipalityRecordService.sortListPercentageInformality().size()-1).name()+", "+municipalityRecordService.sortListPercentageInformality().get(municipalityRecordService.sortListPercentageInformality().size()-1).informalityPercentage()+"%");
        System.out.println(municipalityRecordService.sortListPercentageInformality().get(municipalityRecordService.sortListPercentageInformality().size()-2).name()+", "+municipalityRecordService.sortListPercentageInformality().get(municipalityRecordService.sortListPercentageInformality().size()-2).informalityPercentage()+"%");
        System.out.println(municipalityRecordService.sortListPercentageInformality().get(municipalityRecordService.sortListPercentageInformality().size()-3).name()+", "+municipalityRecordService.sortListPercentageInformality().get(municipalityRecordService.sortListPercentageInformality().size()-3).informalityPercentage()+"%");
        System.out.println(municipalityRecordService.sortListPercentageInformality().get(municipalityRecordService.sortListPercentageInformality().size()-4).name()+", "+municipalityRecordService.sortListPercentageInformality().get(municipalityRecordService.sortListPercentageInformality().size()-4).informalityPercentage()+"%");
        System.out.println("\nMunicipality with the least informality: "+ municipalityRecordService.sortListPercentageInformality().get(0).name()+", "+municipalityRecordService.sortListPercentageInformality().get(0).informalityPercentage()+"%");
        System.out.println("""
                           \nMunicipalities with a higher rate of informality can  
                           evaluate models of municipalities.txt with less informality to apply possible 
                           successful business models in other regions or the world to generate 
                           quality jobs and economic growth in the region.""");

    }
}