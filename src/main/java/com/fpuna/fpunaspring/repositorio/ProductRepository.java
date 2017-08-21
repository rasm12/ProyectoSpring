/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpuna.fpunaspring.repositorio;

import com.fpuna.fpunaspring.entidades.Product;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
    List<Product> findByPriceGreaterThan(Double price);
    List<Product> findByNameStartingWithIgnoreCase(String param);
}
