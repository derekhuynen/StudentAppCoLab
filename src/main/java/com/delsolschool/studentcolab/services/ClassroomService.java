package com.delsolschool.studentcolab.services;

import java.util.List;
import com.delsolschool.studentcolab.model.Classroom;

public interface ClassroomService {

    List<Classroom> getAllClassrooms();

    Classroom getClassroomById(int id);

    void addClassroom(Classroom classroom);

    void deleteClassroom(int id);
}
