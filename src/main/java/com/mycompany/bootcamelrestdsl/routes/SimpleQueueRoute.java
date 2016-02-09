/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bootcamelrestdsl.routes;

import org.apache.camel.builder.RouteBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 *
 * @author 
 */
@Component
public class SimpleQueueRoute extends RouteBuilder{

    private static final Logger log =LoggerFactory.getLogger(SimpleQueueRoute.class);
    
    
    @Override  public void configure() throws Exception {
        log.info("configure()");
        from("{{route.from}}"). to("{{route.to}}");
    }
    
}
