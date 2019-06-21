package com.bitcamp.web.service;

import java.util.List;

import com.bitcamp.web.common.util.PageProxy;
import com.bitcamp.web.domain.CustomerDTO;

import org.springframework.stereotype.Component;

/**
 * CustomerService
 */
@Component
public interface CustomerService {
    public void addCustomer(CustomerDTO customer);

    public List<CustomerDTO> findCustomer(PageProxy pxy);

    public List<CustomerDTO> findCustomerByWord(CustomerDTO customer);

    public CustomerDTO findCustomerById(String customerId);

    public int updateCustomer(CustomerDTO customer);

    public void deleteCustomer(CustomerDTO customer);

    
    public CustomerDTO login(CustomerDTO customer);

    
}