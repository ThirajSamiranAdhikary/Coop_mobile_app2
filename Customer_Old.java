package com.coop.thiraj.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Customer_Old {
    @Id
    private Integer id;
    private String title;
    private String first_name;
    private String last_name;
    private String nic;
    private String mobile_no;
    private String email;
    private String password;
}
