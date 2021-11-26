package com.example.controller.test.impl;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\"\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\tH\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/example/controller/test/impl/TestControllerImpl;", "Lcom/example/controller/test/TestController;", "testUseCase", "Lcom/example/usecase/TestUseCase;", "(Lcom/example/usecase/TestUseCase;)V", "testEndpoint", "Lorg/springframework/http/ResponseEntity;", "Lcom/example/controller/test/rest/TestResponse;", "qname", "", "qtype", "infraestructure"})
@org.springframework.web.bind.annotation.RestController
public class TestControllerImpl implements com.example.controller.test.TestController {
    private final com.example.usecase.TestUseCase testUseCase = null;
    
    public TestControllerImpl(@org.jetbrains.annotations.NotNull
    com.example.usecase.TestUseCase testUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    @org.springframework.web.bind.annotation.GetMapping(value = {"lookup/{qname}/{qtype}"})
    public org.springframework.http.ResponseEntity<com.example.controller.test.rest.TestResponse> testEndpoint(@org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.PathVariable(name = "qname")
    java.lang.String qname, @org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.PathVariable(name = "qtype")
    java.lang.String qtype) {
        return null;
    }
}