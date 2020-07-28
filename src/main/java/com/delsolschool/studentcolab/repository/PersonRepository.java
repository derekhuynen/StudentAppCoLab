package com.delsolschool.studentcolab.repository;
import org.springframework.data.repository.CrudRepository;
import com.delsolschool.studentcolab.model.Person;

public interface PersonRepository extends CrudRepository<Person, Integer> {
}
