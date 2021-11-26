package com.example.persistence.test.repository;

import com.example.persistence.test.entity.DomainRegistry
import org.springframework.data.jpa.repository.JpaRepository

interface DomainRegistryRepository : JpaRepository<DomainRegistry, Long> {

    fun findByQnameAndQtype(qname: String, qtype: String): List<DomainRegistry>

    fun findByQname(qname: String): List<DomainRegistry>
}
