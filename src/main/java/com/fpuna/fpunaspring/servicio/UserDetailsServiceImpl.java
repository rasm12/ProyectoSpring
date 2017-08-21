/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpuna.fpunaspring.servicio;

import com.fpuna.fpunaspring.entidades.Users;
import com.fpuna.fpunaspring.repositorio.UserRepositorio;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

/**
 *
 * @author Richard
 */
@Component
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserRepositorio ur;

    @Override
    public UserDetails loadUserByUsername(String string) throws UsernameNotFoundException {
        Users usr = ur.findByUsernameIgnoreCase(string);

        List<SimpleGrantedAuthority> auths = new ArrayList<>();

        auths.add(new SimpleGrantedAuthority("ADMIN_ROLE"));
        auths.add(new SimpleGrantedAuthority("USER_ROLE"));

        return new User(usr.getUsername(), usr.getPassword(), auths);
    }

}
