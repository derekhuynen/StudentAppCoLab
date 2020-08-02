package com.delsolschool.studentcolab.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import com.delsolschool.studentcolab.model.Classroom;
import com.delsolschool.studentcolab.services.ClassroomService;


@RestController
@RequestMapping(value="/api")

public class ClassroomController {



    @Autowired
    private ClassroomService classroomService;

    @GetMapping("/classrooms")
    public List<Classroom> getAllClassrooms() {
        return classroomService.getAllClassrooms();
    }

    @PutMapping("/classrooms")
    public Classroom addClassroom(@RequestBody Classroom classroom) {
        classroomService.addClassroom(classroom);
        return classroom;
    }

    @PostMapping("/classrooms")
    public Classroom postClassroom(@RequestBody Classroom classroom) {
        classroomService.addClassroom(classroom);
        return classroom;
    }

    @GetMapping("/classrooms/{id}")
    public Classroom getClassroomById(@PathVariable int id) {
        return classroomService.getClassroomById(id);
    }

    @DeleteMapping("/classrooms/{id}")
    public String delete(@PathVariable int id) {
        classroomService.deleteClassroom(id);

        return "Classroom removed with id " + id;
    }

}
