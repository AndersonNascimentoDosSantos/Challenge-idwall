package com.idwall.challengeapi.converters;

import com.idwall.challengeapi.interfaces.PersonClassification;
import com.idwall.challengeapi.interfaces.SortOrder;
import org.modelmapper.Converter;
import org.modelmapper.spi.MappingContext;

public class StringToPersonClassificationConverter implements Converter<String, PersonClassification> {
    @Override
    public PersonClassification convert(MappingContext<String, PersonClassification> context) {
        String source = context.getSource();
        return PersonClassification.getByValue(source);
    }
}

