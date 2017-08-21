/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpuna.fpunaspring.servicio;

import com.fpuna.fpunaspring.entidades.Product;
import com.fpuna.fpunaspring.repositorio.ProductRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository product;

    @Override
    public Iterable<Product> productList() {
        return product.findAll();
    }

    @Override
    public void productDelete(Long id) {
        this.product.delete(id);
    }

    @Override
    public void productAdd(Product product) {
        this.product.save(product);
    }

    @Override
    public Long productCount() {
        return this.product.count();
    }

    @Override
    public List<Product> buscar(String pr) {
        return this.product.findByNameStartingWithIgnoreCase(pr);
    }
}
