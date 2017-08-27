/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpuna.fpunaspring.services;

import com.fpuna.fpunaspring.entidades.Producto;
import java.util.List;
import com.fpuna.fpunaspring.dao.ProductoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 *
 * @author Richard
 */
@Service
public class ProductoServiceImpl implements ProductoService {

    @Autowired
    private ProductoDao pdao;

    @Override
    public List<Producto> todos() {
        return pdao.findAll();
    }

}
