package com.dimassheldon.jalinbisa.crudapi.service;

import com.dimassheldon.jalinbisa.crudapi.dto.CustomerDTO;
import com.dimassheldon.jalinbisa.crudapi.entity.Customer;
import com.dimassheldon.jalinbisa.crudapi.repository.CustomerRepository;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private ModelMapper modelMapper;

    public CustomerDTO saveCustomer(CustomerDTO customerDTO) {
        customerRepository.save(modelMapper.map(customerDTO, Customer.class));
        return customerDTO;
    }

    public List<CustomerDTO> getAllCustomer() {
        List<Customer> customerList = customerRepository.findAll();
        return modelMapper.map(customerList, new TypeToken<List<CustomerDTO>>() {
        }.getType());
    }

    public CustomerDTO updateCustomer(CustomerDTO customerDTO) {
        customerRepository.save(modelMapper.map(customerDTO, Customer.class));
        return customerDTO;
    }

    public boolean deleteCustomer (CustomerDTO customerDTO) {
        customerRepository.delete(modelMapper.map(customerDTO, Customer.class));
        return true;
    }
}
