/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bootcamelrestdsl.routes;

import com.mycompany.bootcamelrestdsl.domain.User;
import com.mycompany.bootcamelrestdsl.domain.Users;
import com.mycompany.bootcamelrestdsl.service.UserService;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestBindingMode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;



/**
 *
 * @author b1050502
 */
@Component
public class RestRoute extends RouteBuilder {

    @Autowired
    private UserService userService;

    @Override
    public void configure() throws Exception {
        restConfiguration().component("servlet").bindingMode(RestBindingMode.auto);
        
        rest()
                .consumes("application/xml").produces("application/xml")
                
                // get list of users
                .get("/users").description("get a collection of Users").outType(Users.class)
                .to("bean:userService?method=getUsers")
                
                // find a specific user
                .get("/users/{user}").description("Get a user by Name").outType(User.class)
                .to("bean:userService?method=getUser(${header.user})");

        
    }
}
