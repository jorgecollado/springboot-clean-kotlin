package com.example.persistence.domain.repository;

import com.example.persistence.domain.entity.DomainRegistry
import org.springframework.data.jpa.repository.JpaRepository

interface DomainRegistryJPARepository : JpaRepository<DomainRegistry, Long> {

    fun findByQnameAndQtype(qname: String, qtype: String): List<DomainRegistry>

    fun findByQname(qname: String): List<DomainRegistry>


}
