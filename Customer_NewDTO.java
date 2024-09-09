package com.coop.thiraj.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Customer_NewDTO {
    private Integer id;
    private String vehicle_details;
    private String customer_name;
    private String customer_nic;
    private String mobile_no;
    private String vehicle_no;
    private String vehicle_model;
    private String manufactured_year;

}
