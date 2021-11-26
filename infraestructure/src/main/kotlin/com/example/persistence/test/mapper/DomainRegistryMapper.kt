package com.example.persistence.test.mapper;

import com.example.DomainRegistryDto
import com.example.persistence.test.entity.DomainRegistry

class DomainRegistryMapper {

    companion object {
        fun mapToDtos(domainRegistryEntities: List<DomainRegistry>): List<DomainRegistryDto> {

            val domainRegistryDtos = ArrayList<DomainRegistryDto>()

            for (domainRegistryEntity in domainRegistryEntities)
                domainRegistryDtos.add(mapToDto(domainRegistryEntity))
            return domainRegistryDtos;
        }

        fun mapToDto(domainRegistryEntity: DomainRegistry): DomainRegistryDto =
            DomainRegistryDto(
                domainRegistryEntity.qname,
                domainRegistryEntity.qtype,
                domainRegistryEntity.content,
                domainRegistryEntity.ttl
            );
    }
}
