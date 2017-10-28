package com.fpuna.fpunaspring.controlador;

import com.fpuna.fpunaspring.entidades.Customer;
import com.fpuna.fpunaspring.entidades.User;
import com.fpuna.fpunaspring.services.CustomerService;
import com.fpuna.fpunaspring.services.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;
    
    @Autowired
    private CustomerService servicioCliente;

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<User> getAllUsers() {
        return userService.findAll();
    }

    @RequestMapping(value = "/{userId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<User> getUser(@PathVariable long userId) {
        User user = userService.findById(userId);
        ResponseEntity<User> response;
        if (user == null) {
            response = new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            response = new ResponseEntity<>(user, HttpStatus.OK);
        }
         return response;
    }

    @RequestMapping(method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public void insertUser(@RequestBody User user) {
        userService.save(user);
    }
    
    @RequestMapping(method = RequestMethod.POST, value = "/cliente")
    @ResponseStatus(HttpStatus.CREATED)
    public void insertCustomer(@RequestBody Customer cliente) {
        
        servicioCliente.add(cliente);
    }

    @RequestMapping(value = "/{userId}", method = RequestMethod.PUT)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateUser(@PathVariable long userId, @RequestBody User user) {
        User userOld = userService.findById(userId);
        if (userOld != null) {
            userService.update(userOld.copyFrom(user));
        }
    }

    @RequestMapping(value = "/{userId}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteUser(@PathVariable long userId) {
        userService.delete(userId);
    }
}
