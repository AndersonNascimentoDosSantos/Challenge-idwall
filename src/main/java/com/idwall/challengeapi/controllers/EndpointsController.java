package com.idwall.challengeapi.controllers;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.idwall.challengeapi.config.ModelMapperConfig;
import com.idwall.challengeapi.entities.FBI.Item;
import com.idwall.challengeapi.entities.Interpol.Notice;
import com.idwall.challengeapi.interfaces.FBIParameters;
import com.idwall.challengeapi.interfaces.InterpolParameters;
import com.idwall.challengeapi.interfaces.QueryParameters;
import com.idwall.challengeapi.services.FBIService;
import com.idwall.challengeapi.services.InterpolService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

import org.modelmapper.config.Configuration;

import javax.print.attribute.standard.Destination;

@RestController

@RequestMapping("/")
public class EndpointsController {
    @Autowired
    private FBIService fbiService;

    @Autowired
    private InterpolService interpolService;
    private final ModelMapper modelMapper;

    @Autowired
    public EndpointsController(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }


    @GetMapping("/coletar-dados")

    public ResponseEntity<Object> getData(@RequestParam Map<String, String> queryParams) {
//        QueryParameters queryParameters = modelMapper.map(queryParams, QueryParameters.class);
        Gson gson = new GsonBuilder().setLenient().create();
        QueryParameters queryParameters = gson.fromJson(queryParams.toString(), QueryParameters.class);
        FBIParameters fbiParameters = modelMapper.map(queryParameters,FBIParameters.class);
        InterpolParameters interpolParameters = modelMapper.map(queryParameters,InterpolParameters.class);
//        // Lógica para determinar qual serviço chamar com base nos parâmetros ou em alguma condição
        Item[] fbiData = fbiService.BuscarFBI(fbiParameters);
        Notice interpolData = interpolService.getInterpolData(interpolParameters);
//
        Map<String, Object> responseData = new HashMap<>();
        responseData.put("commom", queryParameters);
        responseData.put("fbiParameters", fbiParameters);
        responseData.put("interpolParameters",interpolParameters);
        responseData.put("fbiData",fbiData);
        responseData.put("interpolData",interpolData);

        return ResponseEntity.ok(responseData);
    }

}
