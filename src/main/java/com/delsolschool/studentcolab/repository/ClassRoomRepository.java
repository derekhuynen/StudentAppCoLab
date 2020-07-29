package com.delsolschool.studentcolab.repository;

import org.springframework.data.repository.CrudRepository;
import com.delsolschool.studentcolab.model.Classroom;

public interface ClassRoomRepository extends CrudRepository<Classroom, Integer>{
}
