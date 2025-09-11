package com.coding.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address {
    @Id
    private String addressId;
    private String addressLine1;
    private String addressLine2;
    private String city;
    private String pincode;
    private String state;
}
