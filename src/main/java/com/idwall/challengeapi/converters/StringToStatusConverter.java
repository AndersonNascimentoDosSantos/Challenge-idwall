package com.idwall.challengeapi.converters;

import com.idwall.challengeapi.interfaces.SortOrder;
import com.idwall.challengeapi.interfaces.Status;
import org.modelmapper.Converter;
import org.modelmapper.spi.MappingContext;

public class StringToStatusConverter implements Converter<String, Status> {
    @Override
    public Status convert(MappingContext<String, Status> context) {
        String source = context.getSource();
        return Status.getByValue(source);
    }
}

