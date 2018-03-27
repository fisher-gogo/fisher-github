package com.service.test4yu.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.apache.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2018-03-27T08:03:01.063Z")

@RestSchema(schemaId = "test4yu")
@RequestMapping(path = "/test4yu", produces = MediaType.APPLICATION_JSON)
public class Test4yuImpl {

    @Autowired
    private Test4yuDelegate userTest4yuDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userTest4yuDelegate.helloworld(name);
    }

}
