/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bootcamelrestdsl.service;

import com.mycompany.bootcamelrestdsl.domain.User;
import com.mycompany.bootcamelrestdsl.domain.Users;
import org.springframework.stereotype.Service;


/**
 *
 * @author 
 */
@Service
public class UserService {

    public UserService() {
    }

    public User process(User user) {
        return user;
    }

    public Users getUsers() {
        Users users = new Users();
        users.add(new User("Brian"));
        users.add(new User("Tatiana"));

        return users;
    }

    public User getUser(String name) {
        Users users = getUsers();
        for (User user : users.getUsers()) {
            if (user.getName().equalsIgnoreCase(name)) {
                return user;
            }
        }
        return null;
    }

}
