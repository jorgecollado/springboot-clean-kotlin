package com.example.controller.domain.mapper;

import com.example.DomainRegistryDto
import com.example.controller.domain.rest.DomainRegistryRest
import com.example.controller.domain.rest.DomainRegistriesRest

class DomainRegistryResponseMapper {

    companion object {

        fun mapToDomainRegistryRests(domainRegistryDtos: List<DomainRegistryDto>): List<DomainRegistryRest> {
            val domainRegistryRests = ArrayList<DomainRegistryRest>();
            for (domainRegistryDto in domainRegistryDtos)
                domainRegistryRests.add(mapToDomainRegistryRest(domainRegistryDto))
            return domainRegistryRests;
        }

        fun mapToDomainRegistryRest(domainRegistryDto: DomainRegistryDto): DomainRegistryRest =
            DomainRegistryRest(
                domainRegistryDto.qname,
                domainRegistryDto.qtype,
                domainRegistryDto.content,
                domainRegistryDto.ttl
            )
    }
}
