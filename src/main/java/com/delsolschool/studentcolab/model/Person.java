package com.delsolschool.studentcolab.model;

import javax.persistence.*;
import java.sql.Date;


@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS )
@Table(name = "person")
public class Person {


    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id @Column(name="id")
    private int id;

    @Column(name="firstname")
    private String firstname;

    @Column(name="lastname")
    private String lastname;

    @Column(name="DOB")
    private Date dob;

    @Column(name="address")
    private String address;

    @Column(name="email")
    private String email;



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }



    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
