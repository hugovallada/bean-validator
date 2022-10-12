package com.github.hugovallada.beanvalidator.client

import com.github.hugovallada.beanvalidator.client.validator.Identifier
import javax.validation.constraints.Min
import javax.validation.constraints.NotBlank
import javax.validation.constraints.Size

data class PersonRequest(
    @get:Identifier
    @get:NotBlank
    val identifier: String,
    @get:NotBlank
    @get:Size(max = 100)
    val name: String,
    @get:Min(1)
    val age: Int
)