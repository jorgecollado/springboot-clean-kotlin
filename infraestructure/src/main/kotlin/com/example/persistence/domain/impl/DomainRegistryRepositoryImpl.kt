package com.example.persistence.domain.impl;

import com.example.DomainRegistryDto
import com.example.persistence.domain.mapper.DomainRegistryMapper
import com.example.persistence.domain.repository.DomainRegistryJPARepository
import com.example.port.domain.DomainRegistryRepository
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;


@Service
class DomainRegistryRepositoryImpl(private val domainRegistryJPARepository: DomainRegistryJPARepository) :
    DomainRegistryRepository {

    override fun get(qname: String, qtype: String): List<DomainRegistryDto>? {
        val result = domainRegistryJPARepository.findByQnameAndQtype(qname, qtype)
        return if (CollectionUtils.isEmpty(result)) null else DomainRegistryMapper.mapToDtos(result)
    }

    override fun get(qname: String): List<DomainRegistryDto>? {
        val result = domainRegistryJPARepository.findByQname(qname);
        return if (CollectionUtils.isEmpty(result)) null else DomainRegistryMapper.mapToDtos(result)
    }

    override fun delete(qname: String): List<DomainRegistryDto>? =
        domainRegistryJPARepository.findByQname(qname)
            .let { domainRegistries ->
                for (domainRegistry in domainRegistries){
                    domainRegistryJPARepository.delete(domainRegistry)
                }
                return DomainRegistryMapper.mapToDtos(domainRegistries)
            }
}
