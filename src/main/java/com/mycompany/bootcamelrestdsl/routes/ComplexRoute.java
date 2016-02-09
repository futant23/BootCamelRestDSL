/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bootcamelrestdsl.routes;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

/**
 *
 * @author b1050502
 */
@Component
public class ComplexRoute extends RouteBuilder{

    @Override
    public void configure() throws Exception {
        from("activemq:queue:ROUTE").to("log:info");
    }
    
}
