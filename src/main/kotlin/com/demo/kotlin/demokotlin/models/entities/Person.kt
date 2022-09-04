package com.demo.kotlin.demokotlin.models.entities

import java.util.Date
import javax.persistence.*

@Entity
@Table(name = "cat_personas")
data class Person(
    @Column(name = "ine") val ine: String = "",
    @Column(name = "nombre") val nombre: String = "",
    @Column(name = "appaterno") val apPaterno: String = "",
    @Column(name = "apmaterno") val apMaterno: String = "",
    @Column(name = "fechanacimiento") val fechaNacimiento: Date? = null
) {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "serial")
    var id: Long = 0;
}