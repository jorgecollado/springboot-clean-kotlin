package com.example.port;

import com.example.DomainRegistryDto

interface TestService {

    fun getValues(qname: String, qtype: String): List<DomainRegistryDto>?

    fun getValues(qname: String) : List<DomainRegistryDto>?
}
