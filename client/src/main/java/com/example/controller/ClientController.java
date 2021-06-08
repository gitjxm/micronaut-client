package com.example.controller;

import com.example.client.HelloClient;
import com.example.dto.ApiResult;
import com.hzon.de.error.DeError;
import com.hzon.de.error.enums.DeCoreAppError;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.PathVariable;
import io.micronaut.http.client.exceptions.HttpClientResponseException;

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

    @Get("/timeout/{id}")
    public String timeout(@PathVariable String id){
        ApiResult<String> result = helloClient.timeout(id);
        return "client recieved:" + result;
    }

    @Get("/error/{id}")
    public ApiResult error(@PathVariable String id){
        ApiResult<String> result = null;
        try {
            result = helloClient.error(id);
        } catch (HttpClientResponseException e) {

                return ApiResult.notOk(DeCoreAppError.METHOD_INVOKE_ERROR.getError());

        }
        return ApiResult.ok("client recieved:" + result);
    }
}
