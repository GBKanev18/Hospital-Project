package com.example.HospitalProject.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Patient {

    @Id
    @Column
    private int patient_id;

    @Column
    private String first_name;

    @Column
    private String last_name;

    @Column
    private int age;

    public Patient(int patient_id, String first_name, String last_name, int age) {
        this.patient_id = patient_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.age = age;
    }

    public Patient() {

    }


    public int getPatient_id() {
        return patient_id;
    }

    public void setPatient_id(int patient_id) {
        this.patient_id = patient_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
