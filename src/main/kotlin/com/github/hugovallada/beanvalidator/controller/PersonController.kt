package com.github.hugovallada.beanvalidator.controller

import com.github.hugovallada.beanvalidator.client.PersonRequest
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.*
import javax.validation.Valid

@RestController
@RequestMapping("/people")
class PersonController {

    @PostMapping
    fun createPerson(@RequestBody @Valid person: PersonRequest): ResponseEntity<Any> {
        println(person)
        println(UUID.fromString(person.identifier))
        return ResponseEntity.ok(null)
    }

}