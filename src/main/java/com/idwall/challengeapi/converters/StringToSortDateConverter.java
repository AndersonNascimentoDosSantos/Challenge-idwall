package com.idwall.challengeapi.converters;

import com.idwall.challengeapi.interfaces.SortDate;
import org.modelmapper.Converter;
import org.modelmapper.spi.MappingContext;

public class StringToSortDateConverter implements Converter<String, SortDate> {
    @Override
    public SortDate convert(MappingContext<String, SortDate> context) {
        String source = context.getSource();
        return SortDate.getByValue(source);
    }
}

