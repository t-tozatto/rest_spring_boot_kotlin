package br.com.erudio.services

import br.com.erudio.model.Person
import org.springframework.stereotype.Service
import java.util.concurrent.atomic.AtomicLong
import java.util.logging.Logger

@Service
class PersonService {
    private val counter: AtomicLong = AtomicLong()
    private val logger = Logger.getLogger(PersonService::class.java.name)

    fun findById(id: Long): Person{
        logger.info("Finding one person!")

        return mockPerson()
    }

    fun findAll(): List<Person>{
        logger.info("Finding all people!")

        var persons: MutableList<Person> = ArrayList()
        for(i in 0 .. 7)
            persons.add(mockPerson())

        return persons
    }

    fun create(person: Person) = person
    fun update(person: Person) = person
    fun delete(id: Long) {}

    private fun mockPerson(): Person{
        return Person(counter.incrementAndGet(),
            "Thais",
            "Tozatto",
            "Brazil",
            "Female")
    }
}