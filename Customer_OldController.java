package com.coop.thiraj.Controller;

import com.coop.thiraj.DTO.Customer_OldDTO;
import com.coop.thiraj.Service.Customer_OldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(value="/api/v3")
public class Customer_OldController {

    @Autowired
    private Customer_OldService customerOldService;

    @GetMapping("/getOldCustomers")
    public List<Customer_OldDTO> getOldCustomers(){
        return customerOldService.getAllOldCustomers();
    }

    @GetMapping("/getBynic/{nic}")
    public List<Customer_OldDTO> getBynic(@PathVariable String nic){
        return customerOldService.getBynic(nic);
    }

    @PostMapping("/saveOldCustomer")
    public Customer_OldDTO saveOldUsers(@RequestBody Customer_OldDTO customerOldDTO){
        return customerOldService.saveOldCustomer(customerOldDTO);

    }

    @PutMapping("/updatecustomer")
    public Customer_OldDTO updateOldCustomer(@RequestBody Customer_OldDTO customerOldDTO){
        return customerOldService.updateOldCustomer(customerOldDTO);
    }

    @DeleteMapping("/deletecustomer")
    public String deleteOldCustomer(@RequestBody Customer_OldDTO customerOldDTO){
        try{
            return customerOldService.deleteOldCustomer(customerOldDTO); }

        catch (Exception e) {
            throw new RuntimeException(e);
        }


    }


}
