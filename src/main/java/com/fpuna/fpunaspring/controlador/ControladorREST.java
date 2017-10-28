package com.fpuna.fpunaspring.controlador;

import com.fpuna.fpunaspring.entidades.Customer;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControladorREST {

    @RequestMapping(value = "/personas", method = RequestMethod.GET)
    public List<Customer> listaCustomers() {

        List<Customer> lista = new ArrayList<>();

        Customer p = new Customer();
        p.setFirstName("angel");
        p.setId(20L);

        lista.add(p);

        Customer p1 = new Customer();
        p1.setFirstName("gema");
        p1.setId(30L);

        lista.add(p1);

        return lista;
    }
}
