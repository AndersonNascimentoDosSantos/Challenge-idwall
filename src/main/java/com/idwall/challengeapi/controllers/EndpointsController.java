package com.idwall.challengeapi.controllers;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.idwall.challengeapi.entities.FBI.Item;
import com.idwall.challengeapi.entities.Interpol.Notice;
import com.idwall.challengeapi.interfaces.FBIParameters;
import com.idwall.challengeapi.interfaces.InterpolParameters;
import com.idwall.challengeapi.interfaces.QueryParameters;
import com.idwall.challengeapi.services.FBIService;
import com.idwall.challengeapi.services.InterpolService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

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
