package com.github.hugovallada.beanvalidator.client.validator

import org.hibernate.validator.constraints.CompositionType.OR
import org.hibernate.validator.constraints.ConstraintComposition
import org.hibernate.validator.constraints.br.CPF
import javax.validation.Constraint
import javax.validation.Payload
import javax.validation.ReportAsSingleViolation
import kotlin.annotation.AnnotationRetention.RUNTIME
import kotlin.annotation.AnnotationTarget.FIELD
import kotlin.annotation.AnnotationTarget.PROPERTY_GETTER
import kotlin.reflect.KClass

@MustBeDocumented
@Retention(RUNTIME)
@Target(FIELD, PROPERTY_GETTER)
@ConstraintComposition(OR)
@CPF
@UUID
@Constraint(validatedBy = [])
@ReportAsSingleViolation
annotation class Identifier(
    val message: String = "O identificador não é válido",
    val groups: Array<KClass<*>> = [],
    val payload: Array<KClass<out Payload>> = []
)