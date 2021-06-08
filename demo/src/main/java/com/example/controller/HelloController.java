package com.example.controller;

import com.example.dto.ApiResult;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.PathVariable;


@Controller("/demo")
public class HelloController {

    @Get("/hello/{id}")
    public ApiResult<String> hello(@PathVariable String id){
        return ApiResult.ok("hello" + id);
    }



}
