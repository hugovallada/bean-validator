package com.github.hugovallada.beanvalidator.client.validator


import com.github.hugovallada.beanvalidator.utils.Pattern
import org.springframework.stereotype.Component
import javax.validation.Constraint
import javax.validation.ConstraintValidator
import javax.validation.ConstraintValidatorContext
import javax.validation.Payload
import kotlin.annotation.AnnotationRetention.RUNTIME
import kotlin.annotation.AnnotationTarget.*
import kotlin.reflect.KClass

@MustBeDocumented
@Retention(RUNTIME)
@Target(PROPERTY_GETTER, FIELD, ANNOTATION_CLASS)
@Constraint(validatedBy = [UUIDValidator::class])
annotation class UUID(
    val message: String = "O identificador não é um guid valid",
    val groups: Array<KClass<*>> = [],
    val payload: Array<KClass<out Payload>> = []
)

@Component
class UUIDValidator : ConstraintValidator<UUID, String> {
    override fun isValid(value: String?, context: ConstraintValidatorContext?) =
        value?.matches(Pattern.UUID.regexPattern) ?: false

}
