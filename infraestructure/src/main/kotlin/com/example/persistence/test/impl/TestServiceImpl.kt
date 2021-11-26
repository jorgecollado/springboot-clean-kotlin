package com.example.persistence.test.impl;

import com.example.DomainRegistryDto
import com.example.persistence.test.mapper.DomainRegistryMapper
import com.example.persistence.test.repository.DomainRegistryRepository
import com.example.port.TestService
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;


@Service
class TestServiceImpl(private val domainRegistryRepository: DomainRegistryRepository) : TestService {

    override fun getValues(qname: String, qtype: String): List<DomainRegistryDto>? {
        val result = domainRegistryRepository.findByQnameAndQtype(qname, qtype)
        return if (CollectionUtils.isEmpty(result)) null else DomainRegistryMapper.mapToDtos(result)
    }

    override fun getValues(qname: String): List<DomainRegistryDto>? {
        val result = domainRegistryRepository.findByQname(qname);
        return if (CollectionUtils.isEmpty(result)) null else DomainRegistryMapper.mapToDtos(result)
    }
}
