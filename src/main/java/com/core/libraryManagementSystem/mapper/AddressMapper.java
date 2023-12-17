package com.core.libraryManagementSystem.mapper;

import com.core.libraryManagementSystem.dto.AddressDto;
import com.core.libraryManagementSystem.model.AddressModel;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AddressMapper {

    AddressMapper INSTANCE= Mappers.getMapper(AddressMapper.class);

    AddressModel addressDtoIntoAddressModel(AddressDto addressDto);
    AddressDto addressModelIntoAddressDto(AddressModel address);

}
