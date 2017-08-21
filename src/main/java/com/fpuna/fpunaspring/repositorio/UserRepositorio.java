/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpuna.fpunaspring.repositorio;

import com.fpuna.fpunaspring.entidades.Users;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Richard
 */
public interface UserRepositorio extends JpaRepository<Users, String> {
    public Users findByUsernameIgnoreCase(String username);   
}
