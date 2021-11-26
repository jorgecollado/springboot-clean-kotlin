package com.example.persistence.test.impl;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0016J \u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/example/persistence/test/impl/TestServiceImpl;", "Lcom/example/port/TestService;", "domainRegistryRepository", "Lcom/example/persistence/test/repository/DomainRegistryRepository;", "(Lcom/example/persistence/test/repository/DomainRegistryRepository;)V", "getValues", "", "Lcom/example/DomainRegistryDto;", "qname", "", "qtype", "infraestructure"})
@org.springframework.stereotype.Service
public class TestServiceImpl implements com.example.port.TestService {
    private final com.example.persistence.test.repository.DomainRegistryRepository domainRegistryRepository = null;
    
    public TestServiceImpl(@org.jetbrains.annotations.NotNull
    com.example.persistence.test.repository.DomainRegistryRepository domainRegistryRepository) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.util.List<com.example.DomainRegistryDto> getValues(@org.jetbrains.annotations.NotNull
    java.lang.String qname, @org.jetbrains.annotations.NotNull
    java.lang.String qtype) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.util.List<com.example.DomainRegistryDto> getValues(@org.jetbrains.annotations.NotNull
    java.lang.String qname) {
        return null;
    }
}