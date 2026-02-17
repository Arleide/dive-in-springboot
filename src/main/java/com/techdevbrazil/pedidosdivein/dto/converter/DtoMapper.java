package com.techdevbrazil.pedidosdivein.dto.converter;

import org.modelmapper.ModelMapper;
public class DtoMapper {

    private static final ModelMapper modelMapper = new ModelMapper();

    public static <ORIGEM, DESTINO> DESTINO converter(ORIGEM oriem, Class<DESTINO> destinoClass) {
        return modelMapper.map(oriem, destinoClass);
    }

}
