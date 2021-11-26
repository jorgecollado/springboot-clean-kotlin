package com.example.usecase;

import com.example.DomainRegistryDto

interface TestUseCase {

    fun test(qname: String, qtype: String): List<DomainRegistryDto>?
}
