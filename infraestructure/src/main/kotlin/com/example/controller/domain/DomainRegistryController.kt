package com.example.controller.domain;

import com.example.controller.domain.rest.DomainRegistriesRest
import com.example.controller.domain.rest.DomainRegistryRest
import org.springframework.http.ResponseEntity

interface DomainRegistryController {

    fun get(qname: String, qtype: String): ResponseEntity<DomainRegistriesRest>

    fun delete(qname: String, qtype: String): ResponseEntity<DomainRegistriesRest>


}
