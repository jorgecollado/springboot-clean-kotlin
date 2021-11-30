package com.example.usecase.domain.impl;

import com.example.DomainRegistryDto
import com.example.port.domain.DomainRegistryRepository
import com.example.usecase.domain.DeleteUseCase
import com.example.usecase.domain.GetUseCase
import org.springframework.stereotype.Service

@Service
class DeleteUseCaseImpl(private val domainRegistryRepository: DomainRegistryRepository) : DeleteUseCase {

    override fun delete(qname: String): List<DomainRegistryDto>? = domainRegistryRepository.delete(qname)
}
