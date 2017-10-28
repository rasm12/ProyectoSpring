package com.fpuna.fpunaspring.services;

import com.fpuna.fpunaspring.entidades.User;
import java.util.List;


public interface UserService {
 
    User findById(Long id);
 
    List<User> findAll();
 
    User save(User user);
 
    User update(User user);
 
    void delete(Long id);
}