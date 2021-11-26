package com.example.usecase;

import com.example.DomainRegistryDto
import com.example.port.TestService
import org.springframework.stereotype.Service

@Service
class TestUseCaseImpl(private val testService: TestService) : TestUseCase {

    val ANY = "ANY";

    override fun test(qname: String, qtype: String): List<DomainRegistryDto>? =
        if (ANY.equals(qtype)) testService.getValues(qname) else testService.getValues(qname, qtype)

}
