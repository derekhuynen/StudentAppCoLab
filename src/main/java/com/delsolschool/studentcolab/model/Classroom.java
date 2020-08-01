package com.delsolschool.studentcolab.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;


@Entity
@Table(name = "classroom")
public class Classroom {



    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id @Column(name="classroomID")
    private int classroomID;

    @Column(name="name")
    private String name;

    @Column(name="room")
    private String room;


    public int getClassroomID() {
        return classroomID;
    }

    public String getName() {
        return name;
    }

    public String getRoom() {
        return room;
    }

    public void setClassroomID(int classroomID) {
        this.classroomID = classroomID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRoom(String room) {
        this.room = room;
    }


}
