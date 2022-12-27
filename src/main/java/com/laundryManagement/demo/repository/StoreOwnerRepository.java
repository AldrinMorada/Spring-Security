package com.laundryManagement.demo.repository;
import com.laundryManagement.demo.model.StoreOwner;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StoreOwnerRepository extends JpaRepository<StoreOwner, Long> {

}
