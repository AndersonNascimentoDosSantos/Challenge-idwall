package com.idwall.challengeapi.config;

import com.idwall.challengeapi.converters.*;
import com.idwall.challengeapi.interfaces.FBIParameters;
import com.idwall.challengeapi.interfaces.PersonClassification;
import com.idwall.challengeapi.interfaces.QueryParameters;
import org.modelmapper.Converter;
import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;
import org.modelmapper.convention.MatchingStrategies;
import org.modelmapper.spi.MappingContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Map;

@Configuration
public class ModelMapperConfig  {

    @Bean
    public ModelMapper modelMapper() {
        ModelMapper modelMapper = new ModelMapper();
        // Configuração para não mapear campos nulos
        modelMapper.getConfiguration()
                .setFieldMatchingEnabled(true)
                .setFieldAccessLevel(org.modelmapper.config.Configuration.AccessLevel.PRIVATE)
                .setMatchingStrategy(MatchingStrategies.STRICT);

        return modelMapper;
    }
}

