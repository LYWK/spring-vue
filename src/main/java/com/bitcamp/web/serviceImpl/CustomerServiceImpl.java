package com.bitcamp.web.serviceImpl;

import java.util.List;

import com.bitcamp.web.common.util.PageProxy;
import com.bitcamp.web.domain.CustomerDTO;
import com.bitcamp.web.service.CustomerService;

import org.springframework.stereotype.Service;

/**
 * CustomerServiceImpl
 */
@Service
public class CustomerServiceImpl implements CustomerService {
    
    
    
   
   
    @Override
    public void addCustomer(CustomerDTO customer) {
        
    }

    @Override
    public List<CustomerDTO> findCustomer(PageProxy pxy) {
        return null;
    }

    @Override
    public List<CustomerDTO> findCustomerByWord(CustomerDTO customer) {
        return null;
    }

    @Override
    public CustomerDTO findCustomerById(String customerId) {
        return null;
    }

    @Override
    public int updateCustomer(CustomerDTO customer) {
            int res = 0;
             if (res == 1) {
                 System.out.println("서비스 수정 성공");
             } else {
                 System.out.println("서비스 수정 실패");
             }
            return res;
    }

    @Override
    public void deleteCustomer(CustomerDTO customer) {
            
    }


    @Override
    public CustomerDTO login(CustomerDTO customer) {
       System.out.println("controller   에서 넘어온 아이디" + customer.getCustomerId());
       System.out.println("controller   에서 넘어온 아이디" + customer.getPassword());
       CustomerDTO temp = null;
       return temp;
    }



    
}