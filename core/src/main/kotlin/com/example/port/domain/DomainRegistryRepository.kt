package com.example.port.domain;

import com.example.DomainRegistryDto

interface DomainRegistryRepository {

    fun get(qname: String, qtype: String): List<DomainRegistryDto>?

    fun get(qname: String) : List<DomainRegistryDto>?

    fun delete(qname: String) : List<DomainRegistryDto>?
}
