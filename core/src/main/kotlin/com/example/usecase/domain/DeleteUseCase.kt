package com.example.usecase.domain;

import com.example.DomainRegistryDto

interface DeleteUseCase {

    fun delete(qname: String): List<DomainRegistryDto>?
}
