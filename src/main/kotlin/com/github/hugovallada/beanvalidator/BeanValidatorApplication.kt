package com.github.hugovallada.beanvalidator

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BeanValidatorApplication

fun main(args: Array<String>) {
    runApplication<BeanValidatorApplication>(*args)
}
