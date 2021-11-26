package com.example.controller.test.mapper;

import com.example.DomainRegistryDto
import com.example.controller.test.rest.DomainRegistryRest
import com.example.controller.test.rest.TestResponse

class TestResponseMapper {

    companion object {

        fun mapToResponse(domainRegistryDtos: List<DomainRegistryDto>): TestResponse =
            TestResponse(mapToDomainRegistryRests(domainRegistryDtos))


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
