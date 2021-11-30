package com.example.usecase.domain.impl;

import com.example.DomainRegistryDto
import com.example.port.domain.DomainRegistryRepository
import com.example.usecase.domain.GetUseCase
import org.springframework.stereotype.Service

@Service
class
GetUseCaseImpl(private val domainRegistryRepository: DomainRegistryRepository) : GetUseCase {

    val ANY = "ANY";

    override fun get(qname: String, qtype: String): List<DomainRegistryDto>? =
        if (ANY.equals(qtype)) domainRegistryRepository.get(qname) else domainRegistryRepository.get(qname, qtype)

}
