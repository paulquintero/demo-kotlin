package com.demo.kotlin.demokotlin.repositories

import com.demo.kotlin.demokotlin.models.entities.Person
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface PersonRepository: JpaRepository<Person, Long> {

}