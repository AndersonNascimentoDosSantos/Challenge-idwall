package com.idwall.challengeapi.converters;

import com.idwall.challengeapi.interfaces.SortOrder;
import org.modelmapper.Converter;
import org.modelmapper.ModelMapper;
import org.modelmapper.spi.MappingContext;

public class StringToSortOrderConverter implements Converter<String, SortOrder> {
    @Override
    public SortOrder convert(MappingContext<String, SortOrder> context) {
        String source = context.getSource();
        return SortOrder.getByValue(source);
    }
}

