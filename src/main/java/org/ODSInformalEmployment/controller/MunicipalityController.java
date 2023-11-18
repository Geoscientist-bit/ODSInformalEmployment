package org.ODSInformalEmployment.controller;

import org.ODSInformalEmployment.model.MunicipalityData;
import org.ODSInformalEmployment.repository.MunicipalityUsingFileRepositoryImpl;
import org.ODSInformalEmployment.service.MunicipalityRecordService;
import org.ODSInformalEmployment.service.MunicipalityRecordServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/*

 */
@RestController
@RequestMapping("/informalEmployment/")
@CrossOrigin(origins = "*")
public class MunicipalityController {

    MunicipalityRecordService municipalityRecordService = new MunicipalityRecordServiceImpl(new MunicipalityUsingFileRepositoryImpl());

    @GetMapping
    public List<MunicipalityData> municipalityDataList(){
        System.out.println("Listando algo");

        return municipalityRecordService.sortListPercentageInformality();

    };





}
