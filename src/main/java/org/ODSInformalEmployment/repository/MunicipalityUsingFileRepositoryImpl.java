package org.ODSInformalEmployment.repository;

import org.ODSInformalEmployment.model.MunicipalityData;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class MunicipalityUsingFileRepositoryImpl implements MunicipalityDataRepository {

    @Override
    public List<MunicipalityData> addMunicipalityAntioquia() {
        return new ArrayList<>(loadMunicipalities());
    }

    private List<MunicipalityData> loadMunicipalities(){
        return readFileWithMunicipalities().stream().map(this::buildMunicipalityData).toList();
    }

    private List<String> readFileWithMunicipalities(){
        Path path = Paths.get("./src/main/resources/municipalities.txt");
        try (Stream<String> stream = Files.lines(path)) {
            return stream.toList();
        } catch (IOException x) {
            //logger.error("IOException: {0}", x);
        }
        return Collections.emptyList();
    }

    private MunicipalityData buildMunicipalityData(String plainTextMunicipality){
        String[] questionArray = plainTextMunicipality.split(",");
        return new MunicipalityData(questionArray[0], Integer.parseInt(questionArray[1]),
                Double.parseDouble(questionArray[2]), Integer.parseInt(questionArray[3]));
    }
}
