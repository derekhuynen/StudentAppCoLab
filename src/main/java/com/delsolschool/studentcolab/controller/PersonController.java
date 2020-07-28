package com.delsolschool.studentcolab.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import com.delsolschool.studentcolab.model.Person;
import com.delsolschool.studentcolab.services.PersonService;


@RestController
@RequestMapping(value="/api")
public class PersonController {

    @Autowired
    private PersonService personService;

    @GetMapping("/persons")
    public List<Person> getAllPersons() {
        return personService.getAllPersons();
    }

    @PutMapping("/persons")
    public Person addPerson(@RequestBody Person person) {
        personService.addPerson(person);
        return person;
    }

    @GetMapping("/persons/{id}")
    public Person getPersonById(@PathVariable int id) {
        return personService.getPersonById(id);
    }

    @DeleteMapping("/persons/{id}")
    public String delete(@PathVariable int id) {
        personService.deletePerson(id);

        return "Person removed with id " + id;
    }


}
