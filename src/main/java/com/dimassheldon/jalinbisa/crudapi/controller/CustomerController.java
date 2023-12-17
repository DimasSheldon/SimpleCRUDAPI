package com.dimassheldon.jalinbisa.crudapi.controller;

import com.dimassheldon.jalinbisa.crudapi.dto.CustomerDTO;
import com.dimassheldon.jalinbisa.crudapi.entity.Customer;
import com.dimassheldon.jalinbisa.crudapi.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/jalin/customer")
@CrossOrigin
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/getAll")
    public List<CustomerDTO> getCustomer() {
        return customerService.getAllCustomer();
    }

    @PostMapping("/create")
    public CustomerDTO createCustomer(@RequestBody CustomerDTO customerDTO) {
        return customerService.saveCustomer(customerDTO);
    }

    @PutMapping("/update")
    public CustomerDTO updateCustomer(@RequestBody CustomerDTO customerDTO) {
        return customerService.updateCustomer(customerDTO);
    }

    @DeleteMapping("/delete")
//    @PreAuthorize("hasRole('ADMIN')")
    public boolean deleteCustomer(@RequestBody CustomerDTO customerDTO) {
        return customerService.deleteCustomer(customerDTO);
    }
}
