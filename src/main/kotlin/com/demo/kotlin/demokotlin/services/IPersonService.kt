package com.demo.kotlin.demokotlin.services

import com.demo.kotlin.demokotlin.models.entities.Person
import com.demo.kotlin.demokotlin.models.request.PersonRequestDTO
import com.demo.kotlin.demokotlin.models.response.ResponseDTO
import com.demo.kotlin.demokotlin.models.response.SaveResponseDTO

interface IPersonService {
    fun findAll(): List<Person>
    fun finById(id: Long): Person
    fun save(person: PersonRequestDTO): SaveResponseDTO
    fun delete(id: Long): ResponseDTO
}