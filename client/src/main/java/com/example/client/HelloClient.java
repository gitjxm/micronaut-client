package com.example.client;

import com.example.dto.ApiResult;
import io.micronaut.configuration.hystrix.annotation.HystrixCommand;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Header;
import io.micronaut.http.annotation.PathVariable;
import io.micronaut.http.client.annotation.Client;

@Client(id = "demo", path = "/demo")
public interface HelloClient {
    @HystrixCommand
    @Get("/hello/{id}")
    ApiResult<String> hello(@PathVariable String id);

    @Get("/timeout/{id}")
    ApiResult<String> timeout(@PathVariable String id);

    @Get("/error/{id}")
    ApiResult<String> error(@PathVariable String id);
}
