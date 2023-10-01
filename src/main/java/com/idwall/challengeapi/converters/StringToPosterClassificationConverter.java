package com.idwall.challengeapi.converters;

import com.idwall.challengeapi.interfaces.PosterClassification;
import org.modelmapper.Converter;
import org.modelmapper.spi.MappingContext;

public class StringToPosterClassificationConverter implements Converter<String, PosterClassification> {
    @Override
    public PosterClassification convert(MappingContext<String, PosterClassification> context) {
        String source = context.getSource();
        return PosterClassification.getByValue(source);
    }
}

