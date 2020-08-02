package com.delsolschool.studentcolab.services;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.delsolschool.studentcolab.model.Classroom;
import com.delsolschool.studentcolab.repository.ClassRoomRepository;


@Service
@Transactional
public class ClassroomServiceImplementation implements ClassroomService{

    @Autowired
    ClassRoomRepository classroomRepository;

    @Override
    public List<Classroom> getAllClassrooms() {
        return (List<Classroom>) classroomRepository.findAll();
    }

    @Override
    public Classroom getClassroomById(int id) {
        return classroomRepository.findById(id).get();
    }


    @Override
    public void addClassroom(Classroom classRoom) {
        classroomRepository.save(classRoom);
    }

    @Override
    public void deleteClassroom(int id) {
        classroomRepository.deleteById(id);
    }
}
