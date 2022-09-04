package com.demo.kotlin.demokotlin.controllers

import com.demo.kotlin.demokotlin.models.entities.Person
import com.demo.kotlin.demokotlin.models.request.PersonRequestDTO
import com.demo.kotlin.demokotlin.models.response.ResponseDTO
import com.demo.kotlin.demokotlin.models.response.SaveResponseDTO
import com.demo.kotlin.demokotlin.services.IPersonService
import com.demo.kotlin.demokotlin.utilities.Constants
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(Constants.URL_BASE_PERSON)
class PersonController {

    @Autowired
    val personService: IPersonService? = null

    @GetMapping
    fun findAll(): ResponseEntity<List<Person>> {
        return ResponseEntity.ok(this.personService!!.findAll())
    }

    @GetMapping("/{id}")
    fun finById(@PathVariable("id") id: Long): ResponseEntity<Person> {
        return ResponseEntity.ok(this.personService!!.finById(id))
    }

    @PostMapping
    fun save(@RequestBody personRequestDTO: PersonRequestDTO): ResponseEntity<SaveResponseDTO> {
        return ResponseEntity.ok(this.personService!!.save(personRequestDTO))
    }

    @DeleteMapping("/{id}")
    fun delete(@PathVariable("id") id: Long): ResponseEntity<ResponseDTO> {
        return ResponseEntity.ok(this.personService!!.delete(id))
    }
}