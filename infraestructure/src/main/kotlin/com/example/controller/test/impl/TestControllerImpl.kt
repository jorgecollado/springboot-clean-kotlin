package com.example.controller.test.impl;

import com.example.controller.test.TestController
import com.example.controller.test.mapper.TestResponseMapper
import com.example.controller.test.rest.TestResponse
import com.example.controller.test.util.EndpointList.TEST_ENDPOINT
import com.example.usecase.TestUseCase
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class TestControllerImpl(private val testUseCase: TestUseCase) : TestController {

    @GetMapping(TEST_ENDPOINT)
    override fun testEndpoint(
        @PathVariable(name = "qname") qname: String,
        @PathVariable(name = "qtype") qtype: String
    ): ResponseEntity<TestResponse> =
        testUseCase.test(qname, qtype)
            ?.let { result -> ResponseEntity(TestResponseMapper.mapToResponse(result), HttpStatus.OK) }
            ?: ResponseEntity(HttpStatus.BAD_REQUEST)
}

