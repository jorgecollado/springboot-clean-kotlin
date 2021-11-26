package com.example;

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication(scanBasePackages = arrayOf("com.example"))
class DemoApplication

fun main(args: Array<String>) {
    runApplication<DemoApplication>(*args)
}
