package com.example.controller.domain.impl

import com.example.controller.domain.DomainRegistryController
import com.example.controller.domain.mapper.DomainRegistryResponseMapper
import com.example.controller.domain.rest.DomainRegistriesRest
import com.example.controller.domain.util.EndpointList.DOMAIN_REGISTRY_ENDPOINT
import com.example.usecase.domain.DeleteUseCase
import com.example.usecase.domain.GetUseCase
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class DomainRegistryControllerImpl(private val getUseCase: GetUseCase, private val deleteUseCase: DeleteUseCase) :
    DomainRegistryController {

    @GetMapping(DOMAIN_REGISTRY_ENDPOINT)
    override fun get(
        @PathVariable(name = "qname") qname: String,
        @PathVariable(name = "qtype") qtype: String
    ): ResponseEntity<DomainRegistriesRest> =
        getUseCase.get(qname, qtype)
            ?.let { result ->
                ResponseEntity(
                    DomainRegistriesRest(
                        DomainRegistryResponseMapper.mapToDomainRegistryRests(result)
                    ), HttpStatus.OK
                )
            }
            ?: ResponseEntity(HttpStatus.BAD_REQUEST)

    @DeleteMapping(DOMAIN_REGISTRY_ENDPOINT)
    override fun delete(
        @PathVariable(name = "qname") qname: String,
        @PathVariable(name = "qtype") qtype: String
    ): ResponseEntity<DomainRegistriesRest> =
        deleteUseCase.delete(qname)
            ?.let { result ->
                ResponseEntity(
                    DomainRegistriesRest(
                        DomainRegistryResponseMapper.mapToDomainRegistryRests(result)
                    ), HttpStatus.OK
                )
            }
            ?: ResponseEntity(HttpStatus.BAD_REQUEST)
}

