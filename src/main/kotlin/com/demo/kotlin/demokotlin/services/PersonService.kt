package com.demo.kotlin.demokotlin.services

import com.demo.kotlin.demokotlin.exceptions.BusinessException
import com.demo.kotlin.demokotlin.exceptions.NotFoundException
import com.demo.kotlin.demokotlin.models.entities.Person
import com.demo.kotlin.demokotlin.models.request.PersonRequestDTO
import com.demo.kotlin.demokotlin.models.response.ResponseDTO
import com.demo.kotlin.demokotlin.models.response.SaveResponseDTO
import com.demo.kotlin.demokotlin.repositories.PersonRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.Optional

@Service
class PersonService : IPersonService {

    @Autowired
    val personRepository: PersonRepository? = null;

    @Throws(BusinessException::class)
    override fun findAll(): List<Person> {
        try {
            return this.personRepository!!.findAll()
        } catch (e: Exception) {
            throw BusinessException("se ha producido un error $e.message")
        }
    }

    @Throws(BusinessException::class, NotFoundException::class)
    override fun finById(id: Long): Person {
        val op: Optional<Person>
        try {
            op = this.personRepository!!.findById(id)
        } catch (e: Exception) {
            throw BusinessException(e.message)
        }
        if (!op.isPresent) {
            throw NotFoundException("No se encontro a la persona con el id $id")
        }
        return op.get()
    }

    @Throws(BusinessException::class)
    override fun save(person: PersonRequestDTO): SaveResponseDTO {
        val personSaved: Person
        try {
            personSaved = this.personRepository!!.save(person.toPerson())
            return SaveResponseDTO("Persona guarda correctamente con el id generado", personSaved.id)
        } catch (e: Exception) {
            throw BusinessException(e.message)
        }
    }


    @Throws(BusinessException::class)
    override fun delete(id: Long): ResponseDTO {
        val response: ResponseDTO
        try {
            this.personRepository!!.deleteById(id)
            return ResponseDTO("La persona con el ID $id ha sido eliminado de manera exitosa", "")
        } catch (e: Exception) {
            throw  BusinessException("No ha sido posible eliminar el registro $e.message")
        }
    }

}