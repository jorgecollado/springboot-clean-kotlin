package com.example.persistence.test.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H&\u00a8\u0006\n"}, d2 = {"Lcom/example/persistence/test/repository/DomainRegistryRepository;", "Lorg/springframework/data/jpa/repository/JpaRepository;", "Lcom/example/persistence/test/entity/DomainRegistry;", "", "findByQname", "", "qname", "", "findByQnameAndQtype", "qtype", "infraestructure"})
public abstract interface DomainRegistryRepository extends org.springframework.data.jpa.repository.JpaRepository<com.example.persistence.test.entity.DomainRegistry, java.lang.Long> {
    
    @org.jetbrains.annotations.NotNull
    public abstract java.util.List<com.example.persistence.test.entity.DomainRegistry> findByQnameAndQtype(@org.jetbrains.annotations.NotNull
    java.lang.String qname, @org.jetbrains.annotations.NotNull
    java.lang.String qtype);
    
    @org.jetbrains.annotations.NotNull
    public abstract java.util.List<com.example.persistence.test.entity.DomainRegistry> findByQname(@org.jetbrains.annotations.NotNull
    java.lang.String qname);
}