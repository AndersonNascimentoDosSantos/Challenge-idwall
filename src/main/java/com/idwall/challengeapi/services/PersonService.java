package com.idwall.challengeapi.services;

import com.idwall.challengeapi.dtos.PersonDTO;
import com.idwall.challengeapi.entities.Person;
import com.idwall.challengeapi.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class PersonService {
    @Autowired
   private PersonRepository personRepository;

    @Transactional(readOnly = true)
    public PersonDTO findById(Long id){
        Person result = personRepository.findById(id).orElse(null);
        if (result == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Person not found with ID: " + id);
        }
        return new PersonDTO(result);
    }

    @Transactional(readOnly = true)
    public List<PersonDTO> findAll(){
       List<Person> result = personRepository.findAll();
       return result.stream().map(x -> new PersonDTO(x)).toList();
    }
}
