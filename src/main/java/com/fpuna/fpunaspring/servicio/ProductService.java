/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpuna.fpunaspring.servicio;

import com.fpuna.fpunaspring.entidades.Product;
import java.util.List;

/**
 *
 * @author Richard
 */
public interface ProductService {

    public Iterable<Product> productList();

    public void productDelete(Long id);

    public void productAdd(Product product);

    public Long productCount();
    
    public List<Product> buscar(String pr);
}
