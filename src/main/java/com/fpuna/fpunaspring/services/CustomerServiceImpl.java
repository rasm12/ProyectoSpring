/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpuna.fpunaspring.services;

import com.fpuna.fpunaspring.entidades.Customer;
import java.util.List;
import com.fpuna.fpunaspring.dao.CustomerDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 *
 * @author Richard
 */
@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerDao customerDAO;

    @Override
    public List<Customer> todos() {
        return customerDAO.findAll();
    }

    @Override
    public boolean add(Customer customer) {
        return customerDAO.save(customer) != null;
        
    }

    @Override
    public boolean delete(Customer customer) {
        customerDAO.delete(customer);
        return true;
    }

}
