package com.dimassheldon.jalinbisa.crudapi.repository;

import com.dimassheldon.jalinbisa.crudapi.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
