package com.coop.thiraj.Controller;

import com.coop.thiraj.DTO.Customer_NewDTO;
import com.coop.thiraj.Service.Customer_NewService;
import jakarta.servlet.http.PushBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(value = "/api/v2")
public class Customer_NewController {

    @Autowired
    private Customer_NewService customerNewService;

    @GetMapping("/getdata")
    public List<Customer_NewDTO> getAllData(){
        return customerNewService.getAllData();
    }

    @GetMapping("/getByVehiclenumber/{vehicleno}")
    public List<Customer_NewDTO> getByVehiclenumber(@PathVariable String vehicleno){
        return customerNewService.getByVehiclenumber(vehicleno);
    }

    @PostMapping("/saveuser")
    public Customer_NewDTO saveUser(@RequestBody Customer_NewDTO customer_newDTO){
        return customerNewService.saveUser(customer_newDTO);

    }





}
