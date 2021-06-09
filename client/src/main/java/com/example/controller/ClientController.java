package com.example.controller;

import com.example.client.HelloClient;
import com.example.dto.ApiResult;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.PathVariable;

import javax.inject.Inject;

@Controller("/client")
public class ClientController {
    @Inject
    private HelloClient helloClient;

    @Get("/hello/{id}")
    public String hello(@PathVariable String id){
        ApiResult<String> result = helloClient.hello(id);
        return "client recieved:" + result;
    }



}
