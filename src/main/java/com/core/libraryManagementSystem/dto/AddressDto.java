package com.core.libraryManagementSystem.dto;

import lombok.Data;

import java.util.UUID;

@Data
public class AddressDto {
    private UUID id;
    private String city;
    private String area;
}
