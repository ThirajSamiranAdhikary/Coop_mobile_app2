package com.coop.thiraj.DTO;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Customer_OldDTO {
    private Integer id;
    private String title;
    private String first_name;
    private String last_name;
    private String nic;
    private String mobile_no;
    private String email;
    private String password;
}
