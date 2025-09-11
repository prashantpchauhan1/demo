package com.coding.demo.dto;

import com.coding.demo.model.Address;

import java.time.LocalDateTime;
import java.util.List;

public record UserDto(
        String firstName,
        String lastName,
        String password,
        String email,
        String phoneNumber,
        List<Address> addresses ) { }
