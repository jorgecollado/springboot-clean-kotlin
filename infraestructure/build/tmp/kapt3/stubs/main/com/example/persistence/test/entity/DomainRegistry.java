package com.example.persistence.test.entity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0013\b\u0017\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0002\u0010\nR\u001a\u0010\u0005\u001a\u00020\u0003X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\b\u001a\u0004\u0018\u00010\t8\u0016@\u0016X\u0097\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0002\u001a\u00020\u0003X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\f\"\u0004\b\u0015\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u0003X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u0007X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b\u00a8\u0006\u001c"}, d2 = {"Lcom/example/persistence/test/entity/DomainRegistry;", "", "qname", "", "qtype", "content", "ttl", "", "id", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Long;)V", "getContent", "()Ljava/lang/String;", "setContent", "(Ljava/lang/String;)V", "getId", "()Ljava/lang/Long;", "setId", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getQname", "setQname", "getQtype", "setQtype", "getTtl", "()I", "setTtl", "(I)V", "infraestructure"})
@javax.persistence.Entity
public class DomainRegistry {
    @org.jetbrains.annotations.NotNull
    private java.lang.String qname;
    @org.jetbrains.annotations.NotNull
    private java.lang.String qtype;
    @org.jetbrains.annotations.NotNull
    private java.lang.String content;
    private int ttl;
    @org.jetbrains.annotations.Nullable
    @javax.persistence.GeneratedValue
    @javax.persistence.Id
    private java.lang.Long id;
    
    public DomainRegistry(@org.jetbrains.annotations.NotNull
    java.lang.String qname, @org.jetbrains.annotations.NotNull
    java.lang.String qtype, @org.jetbrains.annotations.NotNull
    java.lang.String content, int ttl, @org.jetbrains.annotations.Nullable
    java.lang.Long id) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public java.lang.String getQname() {
        return null;
    }
    
    public void setQname(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public java.lang.String getQtype() {
        return null;
    }
    
    public void setQtype(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public java.lang.String getContent() {
        return null;
    }
    
    public void setContent(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    public int getTtl() {
        return 0;
    }
    
    public void setTtl(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public java.lang.Long getId() {
        return null;
    }
    
    public void setId(@org.jetbrains.annotations.Nullable
    java.lang.Long p0) {
    }
}