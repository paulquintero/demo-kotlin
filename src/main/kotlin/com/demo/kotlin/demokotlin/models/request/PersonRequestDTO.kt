package com.demo.kotlin.demokotlin.models.request

import com.demo.kotlin.demokotlin.models.entities.Person
import java.util.Date

data class PersonRequestDTO(
    val ine: String,
    val nombre: String,
    val apellidoPaterno: String,
    val apellidoMaterno: String,
    val fechaNacimiento: Date? = null
) {
    fun toPerson() = Person(
        ine = ine,
        nombre = nombre,
        apPaterno = apellidoPaterno,
        apMaterno = apellidoMaterno,
        fechaNacimiento = fechaNacimiento
    )
}