package com.github.hugovallada.beanvalidator.utils


enum class Pattern(val regexPattern: Regex) {
    UUID("^[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}$".toRegex())
}