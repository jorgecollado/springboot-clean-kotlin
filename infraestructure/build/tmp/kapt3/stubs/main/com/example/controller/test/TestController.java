package com.example.controller.test;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H&\u00a8\u0006\b"}, d2 = {"Lcom/example/controller/test/TestController;", "", "testEndpoint", "Lorg/springframework/http/ResponseEntity;", "Lcom/example/controller/test/rest/TestResponse;", "qname", "", "qtype", "infraestructure"})
public abstract interface TestController {
    
    @org.jetbrains.annotations.NotNull
    public abstract org.springframework.http.ResponseEntity<com.example.controller.test.rest.TestResponse> testEndpoint(@org.jetbrains.annotations.NotNull
    java.lang.String qname, @org.jetbrains.annotations.NotNull
    java.lang.String qtype);
}