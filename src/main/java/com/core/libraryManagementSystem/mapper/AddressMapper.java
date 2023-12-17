package com.core.libraryManagementSystem.mapper;

import com.core.libraryManagementSystem.dto.AddressDto;
import com.core.libraryManagementSystem.model.AddressModel;
import org.mapstruct.Mapper;

@Mapper
public interface AddressMapper {

    AddressModel addressDtoIntoAddressModel(AddressDto addressDto);
    AddressDto addressModelIntoAddressDto(AddressModel address);

}
