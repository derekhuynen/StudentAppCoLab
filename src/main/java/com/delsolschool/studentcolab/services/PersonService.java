package com.delsolschool.studentcolab.services;
import java.util.List;
import com.delsolschool.studentcolab.model.Person;

public interface PersonService {

    List<Person> getAllPersons();

    Person getPersonById(int id);

    void addPerson(Person person);

    void deletePerson(int id);
}
