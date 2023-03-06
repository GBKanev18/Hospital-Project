package com.example.HospitalProject.Entities;


import javax.persistence.Entity;

@Entity
public class Doctor {

    private int doctor_id;
    private String first_name;
    private String last_name;
    private String speciality;

    public Doctor(int doctor_id, String first_name, String last_name, String speciality) {
        this.doctor_id = doctor_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.speciality = speciality;
    }

    public Doctor() {

    }

    public int getDoctor_id() {
        return doctor_id;
    }

    public void setDoctor_id(int doctor_id) {
        this.doctor_id = doctor_id;
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

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
}
