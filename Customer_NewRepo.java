package com.coop.thiraj.Repo;

import com.coop.thiraj.Entity.Customer_New;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Customer_NewRepo extends JpaRepository <Customer_New, Integer>{

    @Query(value = "SELECT * FROM  Customer_New WHERE vehicle_no=?1",nativeQuery = true)
    List<Customer_New> getByVehiclenumber(String vehicle_no);
}
