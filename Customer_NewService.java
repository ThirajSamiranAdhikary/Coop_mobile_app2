package com.coop.thiraj.Service;


import com.coop.thiraj.DTO.Customer_NewDTO;
import com.coop.thiraj.Entity.Customer_New;
import com.coop.thiraj.Repo.Customer_NewRepo;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class Customer_NewService {
    @Autowired
    private Customer_NewRepo customerNewRepo;

    @Autowired
    private ModelMapper modelMapper;

    public List<Customer_NewDTO> getAllData(){
        List<Customer_New> customer=customerNewRepo.findAll();
        return modelMapper.map(customer,new TypeToken<List<Customer_NewDTO>>(){}.getType());
    }

    public List<Customer_NewDTO> getByVehiclenumber(String vehicle_no){
        List<Customer_New> customer=customerNewRepo.getByVehiclenumber(vehicle_no);
        return modelMapper.map(customer,new TypeToken<List<Customer_NewDTO>>(){}.getType());
    }

    public Customer_NewDTO saveUser(Customer_NewDTO customer_newDTO){
        customerNewRepo.save(modelMapper.map(customer_newDTO,Customer_New.class));
        return modelMapper.map(customer_newDTO,Customer_NewDTO.class);

    }
}
