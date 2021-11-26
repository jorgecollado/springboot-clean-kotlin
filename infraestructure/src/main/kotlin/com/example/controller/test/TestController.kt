package com.example.controller.test;

import com.example.controller.test.rest.TestResponse
import org.springframework.http.ResponseEntity

interface TestController {

    fun testEndpoint(qname: String, qtype: String): ResponseEntity<TestResponse>
}
