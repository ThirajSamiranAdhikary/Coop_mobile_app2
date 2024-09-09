package com.coop.thiraj.Service;

import com.coop.thiraj.DTO.Customer_NewDTO;
import com.coop.thiraj.DTO.Customer_OldDTO;
import com.coop.thiraj.Entity.Customer_New;
import com.coop.thiraj.Entity.Customer_Old;
import com.coop.thiraj.Repo.Customer_OldRepo;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class Customer_OldService {
    @Autowired
    private Customer_OldRepo customerOldRepo;

    @Autowired
    private ModelMapper modelMapper;

    public List<Customer_OldDTO> getAllOldCustomers(){
        List<Customer_Old> customerOldDTOS=customerOldRepo.findAll();
        return modelMapper.map(customerOldDTOS,new TypeToken<List<Customer_NewDTO>>(){}.getType());
    }

    public List<Customer_OldDTO> getBynic(String nic){
        List<Customer_Old> customer=customerOldRepo.getBynic(nic);
        return modelMapper.map(customer,new TypeToken<List<Customer_OldDTO>>(){}.getType());
    }

    public Customer_OldDTO saveOldCustomer(Customer_OldDTO customerOldDTO){
        customerOldRepo.save(modelMapper.map(customerOldDTO,Customer_Old.class));
        return modelMapper.map(customerOldDTO,Customer_OldDTO.class);
    }

    public Customer_OldDTO updateOldCustomer(Customer_OldDTO customerOldDTO){
        customerOldRepo.save(modelMapper.map(customerOldDTO,Customer_Old.class));
        return modelMapper.map(customerOldDTO,Customer_OldDTO.class);
    }

    public String deleteOldCustomer(Customer_OldDTO customerOldDTO){
        customerOldRepo.delete(modelMapper.map(customerOldDTO,Customer_Old.class));
        return "Customer Deleted";
    }


}
