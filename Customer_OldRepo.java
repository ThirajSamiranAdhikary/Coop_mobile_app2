package com.coop.thiraj.Repo;

import com.coop.thiraj.Entity.Customer_New;
import com.coop.thiraj.Entity.Customer_Old;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Customer_OldRepo extends JpaRepository<Customer_Old,Integer> {

    @Query(value = "SELECT * FROM  Customer_Old WHERE nic=?1",nativeQuery = true)
    List<Customer_Old> getBynic(String nic);




}
