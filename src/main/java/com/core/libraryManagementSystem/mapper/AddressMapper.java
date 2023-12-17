package com.core.libraryManagementSystem.mapper;

import com.core.libraryManagementSystem.dto.AddressDto;
import com.core.libraryManagementSystem.model.Address;
import org.mapstruct.Mapper;

@Mapper
public interface AddressMapper {

    Address addressDtoIntoAddressModel(AddressDto addressDto);
    AddressDto addressModelIntoAddressDto(Address address);

}
