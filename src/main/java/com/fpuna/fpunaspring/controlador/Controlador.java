/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpuna.fpunaspring.controlador;

import com.fpuna.fpunaspring.entidades.Customer;
import com.fpuna.fpunaspring.entidades.Producto;
import com.fpuna.fpunaspring.services.CustomerService;
import com.fpuna.fpunaspring.services.ProductoService;
import java.awt.PageAttributes;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import wrapper.ResponseWrapper;

/**
 *
 * @author Richard
 */
@Controller
public class Controlador {

    @Autowired
    private ProductoService ps;

    @Autowired
    private CustomerService cs;

    @RequestMapping("/home")
    public String home(Model model) {
        return "home";
    }
    @RequestMapping("/tabla")
    public String tabla(Model model) {
        return "tabla";
    }

    @RequestMapping("/notificacion")
    public String notify(Model model) {
        return "notificacion";
    }

    @RequestMapping("/jqgrid")
    public String jq(Model model) {
        return "jqgrid";
    }

    @RequestMapping("/registro")
    public String registro(Model model) {
        return "registration_form";
    }

    @RequestMapping("/newcustomer")
    public String newCustomer(Model model) {
        return "new_customer";
    }

    @RequestMapping("/lista")
    public String lista(Model model) {
        return "list";
    }

    @RequestMapping("/direccion")
    public String direccion(Model model) {
        return "address";
    }

    @RequestMapping("/producto2")
    public String producto2(Model model) {
        return "add_product_two";
    }

    @RequestMapping("/factura")
    public String factura() {
        return "factura";
    }

    @RequestMapping("/recibo")
    public String recibo() {
        return "recibo";
    }

    @RequestMapping("/producto")
    public String producto(Model model) {
        List<Producto> lista = ps.todos();

        model.addAttribute("producto", lista.get(0));

        return "add_producto";
    }

    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String logoutPage(HttpServletRequest request, HttpServletResponse response) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if (auth != null) {
            new SecurityContextLogoutHandler().logout(request, response, auth);
        }
        return "redirect:/login?logout";
    }

    @RequestMapping(value = "/contable", method = RequestMethod.GET)
    public String contable() {
        return "contable";
    }

    @RequestMapping(value = "/403", method = RequestMethod.GET)
    public String denegado() {
        return "403";
    }

    // Login form with error
    @RequestMapping(value = "/login-error", method = RequestMethod.GET)
    public String loginError(Model model) {
        model.addAttribute("error", true);
        return "login_mt";
    }

    @RequestMapping(value = "/cliente", method = RequestMethod.GET)
    public String loginError() {
        return "customer";
    }

    @RequestMapping(value = "/addCustomer", method = RequestMethod.POST)
    public @ResponseBody
    ResponseWrapper addCustomer(@RequestBody Customer customerJson) {
        ResponseWrapper RWrapper = new ResponseWrapper();
        try {

            if (!cs.add(customerJson)) {
                RWrapper.setId(1);
                RWrapper.setDescripcion("Error");
                return RWrapper;
            } else {
                RWrapper.setId(0);
                RWrapper.setDescripcion("OK");
            }
            
            int b = 0 / 0;
            return RWrapper;
        } catch (Exception e) {
            cs.delete(customerJson);
            return new ResponseWrapper(999, "ERROR DE PROCESO");
        }
    }

}
