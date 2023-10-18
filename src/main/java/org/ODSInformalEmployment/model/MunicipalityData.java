package org.ODSInformalEmployment.model;

public record MunicipalityData(String name,
                               Integer population,
                               Double informalityPercentage,
                               Integer employedPeople) {}
