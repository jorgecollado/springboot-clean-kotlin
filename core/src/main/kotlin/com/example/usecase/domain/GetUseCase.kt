package com.example.usecase.domain;

import com.example.DomainRegistryDto

interface GetUseCase {

    fun get(qname: String, qtype: String): List<DomainRegistryDto>?
}
