/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpuna.fpunaspring.controlador;

import com.fpuna.fpunaspring.entidades.Product;
import com.fpuna.fpunaspring.servicio.ProductService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Richard
 */
@Controller
public class Controlador {
    
    @Autowired
    private ProductService ps;

    @RequestMapping("/page")
    public String home(Model model) {
        
        List<Product> c = ps.buscar("I");
        
        StringBuilder sb = new StringBuilder();
        
        for (Product product : c) {
            sb.append(product.getName()).append("|");
        }
        
        model.addAttribute("nombre",sb.toString());
        return "nuevo";
    }
}
