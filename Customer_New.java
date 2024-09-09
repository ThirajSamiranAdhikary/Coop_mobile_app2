package com.coop.thiraj.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Customer_New {
    @Id
    private Integer id;
    private String vehicle_details;
    private String customer_name;
    private String customer_nic;
    private String mobile_no;
    private String vehicle_no;
    private String vehicle_model;
    private String manufactured_year;


}
