package org.ODSInformalEmployment.repository;
import java.util.ArrayList;
import java.util.List;
import org.ODSInformalEmployment.model.MunicipalityData;

public class MunicipalityDataRepositoryImpl implements MunicipalityDataRepository {
    @Override
    public List<MunicipalityData> addMunicipalityAntioquia() {
        List<MunicipalityData> municipalitiesAntioquia = new ArrayList<>();
        municipalitiesAntioquia.add(new MunicipalityData("Caracoli",
                4600,
                0.8,
                3800));

        municipalitiesAntioquia.add(new MunicipalityData("La Ceja",
                63000,
                0.44,
                50000));

        municipalitiesAntioquia.add(new MunicipalityData("Puerto Berrio",
                51000,
                0.82,
                48000));

        municipalitiesAntioquia.add(new MunicipalityData("Carmen de Viboral",
                49600,
                0.63,
                43000));

        municipalitiesAntioquia.add(new MunicipalityData("Maceo",
                5128,
                0.78,
                4000));

        municipalitiesAntioquia.add(new MunicipalityData("Guarne",
                55000,
                0.59,
                47000));

        municipalitiesAntioquia.add(new MunicipalityData("Guatape",
                9200,
                0.73,
                7800));

        municipalitiesAntioquia.add(new MunicipalityData("San Roque",
                18000,
                0.92,
                15000));

        municipalitiesAntioquia.add(new MunicipalityData("San Luis",
                13000,
                0.86,
                9000));

        municipalitiesAntioquia.add(new MunicipalityData("Betania",
                11000,
                0.92,
                8000));

        municipalitiesAntioquia.add(new MunicipalityData("Puerto Nare",
                14300,
                0.82,
                11500));

        municipalitiesAntioquia.add(new MunicipalityData("San Carlos",
                11800,
                0.93,
                9200));

        municipalitiesAntioquia.add(new MunicipalityData("La Union",
                33000,
                0.73,
                22000));

        municipalitiesAntioquia.add(new MunicipalityData("Marinilla",
                69000,
                0.70,
                62860));

        municipalitiesAntioquia.add(new MunicipalityData("Amaga",
                32000,
                0.58,
                29000));

        municipalitiesAntioquia.add(new MunicipalityData("Sonson",
                38200,
                0.86,
                27000));

        municipalitiesAntioquia.add(new MunicipalityData("Puerto Triunfo",
                18000,
                0.83,
                14300));

        municipalitiesAntioquia.add(new MunicipalityData("Rionegro",
                146000,
                0.56,
                136000));

        municipalitiesAntioquia.add(new MunicipalityData("Nariño",
                10170,
                0.92,
                7800));

        municipalitiesAntioquia.add(new MunicipalityData("Argelia",
                6000,
                0.81,
                4879));

        municipalitiesAntioquia.add(new MunicipalityData("San Vicente",
                23300,
                0.82,
                17700));

        return municipalitiesAntioquia;
    }
}
