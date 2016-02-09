/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bootcamelrestdsl.web;

import com.mycompany.bootcamelrestdsl.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author 
 */
@RestController
public class UserController {
    
    
    @Autowired
    private UserService userService;
    
    @RequestMapping(name ="/users/count", produces = MediaType.APPLICATION_XML_VALUE, method = RequestMethod.GET)
    public String getUsersCount() {
        
        return "<data>ABCS</data>";
    }
}
