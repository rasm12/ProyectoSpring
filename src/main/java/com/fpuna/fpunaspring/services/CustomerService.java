/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpuna.fpunaspring.services;

import com.fpuna.fpunaspring.entidades.Customer;
import java.util.List;

/**
 *
 * @author Richard
 */
public interface CustomerService {
   public List<Customer> todos();
   public boolean add(Customer customer);
   public boolean delete(Customer customer);
}
