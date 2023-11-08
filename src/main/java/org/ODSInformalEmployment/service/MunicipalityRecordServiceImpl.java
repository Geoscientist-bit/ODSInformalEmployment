package org.ODSInformalEmployment.service;

import org.ODSInformalEmployment.model.MunicipalityData;
import org.ODSInformalEmployment.repository.MunicipalityDataRepository;
import java.util.List;

public class MunicipalityRecordServiceImpl implements MunicipalityRecordService{

    private final MunicipalityDataRepository municipalityDataRepository;

    public MunicipalityRecordServiceImpl(MunicipalityDataRepository municipalityDataRepository) {
        this.municipalityDataRepository = municipalityDataRepository;
    }

    @Override
    public Double calculateEstandardDeviationInformalityMunicipality() {
        double variance = 0d, average = calculateAverageInformalityMunicipalities();
        List<MunicipalityData> municipalitiesAntioquia = this.municipalityDataRepository.addMunicipalityAntioquia();
        for (MunicipalityData municipalityData : municipalitiesAntioquia) {
            variance += (municipalityData.informalityPercentage() - average) * (municipalityData.informalityPercentage() - average);
        }
        return Math.sqrt(variance/(municipalitiesAntioquia.size()-1));
    }

    @Override
    public Integer calculateNumberPeopleInformalEmployment() {
        Integer cumulativeEmpleoyed = 0;
        List<MunicipalityData> municipalitiesAntioquia = this.municipalityDataRepository.addMunicipalityAntioquia();
        for (MunicipalityData municipalityData : municipalitiesAntioquia) {
            cumulativeEmpleoyed += municipalityData.employedPeople();
        }

        return (int)(cumulativeEmpleoyed*calculateAverageInformalityMunicipalities());
        //return  cumulativeEmpleoyed;
    }
    @Override
    public Double calculateAverageInformalityMunicipalities() {
        Double accumulated = 0D;
        List<MunicipalityData> municipalitiesAntioquia = this.municipalityDataRepository.addMunicipalityAntioquia();
        for (MunicipalityData municipalityData : municipalitiesAntioquia) {
            accumulated += municipalityData.informalityPercentage();
        }
        return accumulated/municipalitiesAntioquia.size();
    }


    @Override
    public List<MunicipalityData> sortListPercentageInformality() {
        List<MunicipalityData> municipalitiesAntioquia = this.municipalityDataRepository.addMunicipalityAntioquia();
        for (int i=0; i<municipalitiesAntioquia.size(); i++) //Sorting the list in ascending order taking into account the percentage of informality
        {
            MunicipalityData p = municipalitiesAntioquia.get(i);
            int j = i - 1;

            while(j >= 0 && p.informalityPercentage() < municipalitiesAntioquia.get(j).informalityPercentage())
            {
                municipalitiesAntioquia.set(j+1, municipalitiesAntioquia.get(j));
                j = j - 1;
            }
            municipalitiesAntioquia.set(j+1, p);
        }

        return municipalitiesAntioquia;
    }

    @Override
    public Double medianInformalEmployment() {
        List<MunicipalityData> municipalitiesAntioquia = this.municipalityDataRepository.addMunicipalityAntioquia();
        int median =(municipalitiesAntioquia.size()/2);
        Double medianInformalEmployment ;
        if(municipalitiesAntioquia.size()%2 == 0)
        {
            medianInformalEmployment = (municipalitiesAntioquia.get(median+1).informalityPercentage() + municipalitiesAntioquia.get(median).informalityPercentage()) / 2;
        }
        else
        {
            medianInformalEmployment = municipalitiesAntioquia.get(median+1).informalityPercentage();
        }

        return medianInformalEmployment;

        /*
                if (municipalitiesAntioquia.size() % 2 == 0) {
            int median = municipalitiesAntioquia.size() / 2;
            medianInformalEmployment = IntStream.range(median, median + 2)
                .mapToDouble(i -> municipalitiesAntioquia.get(i).informalityPercentage())
                .average()
                .orElse(0.0);
        } else {
            int median = municipalitiesAntioquia.size() / 2;
            medianInformalEmployment = municipalitiesAntioquia.get(median + 1).informalityPercentage();
        }
         */
    }

    @Override
    public StringBuilder calculateAboveTheMedianInformalityMunicipality() {
        List<MunicipalityData> municipalitiesAntioquia = this.municipalityDataRepository.addMunicipalityAntioquia();
        StringBuilder aboveTheMedian = new StringBuilder();

        municipalitiesAntioquia.stream()
                .filter(municipalityData -> municipalityData.informalityPercentage() >= medianInformalEmployment())
                .forEach(municipalityData -> aboveTheMedian.append(municipalityData).append(", "));

        return (aboveTheMedian);
    }

    public StringBuilder calculateBelowMedianInformalityMunicipality(){
        List<MunicipalityData> municipalitiesAntioquia = this.municipalityDataRepository.addMunicipalityAntioquia();
        StringBuilder belowMedian = new StringBuilder();

        municipalitiesAntioquia.stream()
                .filter(municipalityData -> municipalityData.informalityPercentage() < medianInformalEmployment())
                .forEach(municipalityData -> belowMedian.append(municipalityData).append(", "));

        return belowMedian;
    }
}
