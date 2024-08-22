package com.telenor.nova.star.api;

import com.telenor.nova.star.db.Person;
import com.telenor.nova.star.db.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/names")
public class PeopleController {

    @Autowired
    private PersonRepository personRepository;

    @GetMapping
    public List<Person> getAllNames() {
        return personRepository.findAll();
    }
}
