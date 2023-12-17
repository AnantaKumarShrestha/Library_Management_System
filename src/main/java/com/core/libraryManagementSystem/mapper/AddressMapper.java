package com.core.libraryManagementSystem.mapper;

import com.core.libraryManagementSystem.dto.AddressDto;
import com.core.libraryManagementSystem.model.Address;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AddressMapper {

    AddressMapper INSTANCE= Mappers.getMapper(AddressMapper.class);

    Address addressDtoIntoAddressModel(AddressDto addressDto);
    AddressDto addressModelIntoAddressDto(Address address);

}
