package com.example.HospitalProject.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Appointment {

    @Id
    @Column
    private int appointment_id;

    @Column
    private String typeOfAppointment;

    public Appointment(int appointment_id, String typeOfAppointment) {
        this.appointment_id = appointment_id;
        this.typeOfAppointment = typeOfAppointment;
    }

    public Appointment() {

    }

    public int getAppointment_id() {
        return appointment_id;
    }

    public void setAppointment_id(int appointment_id) {
        this.appointment_id = appointment_id;
    }

    public String getTypeOfAppointment() {
        return typeOfAppointment;
    }

    public void setTypeOfAppointment(String typeOfAppointment) {
        this.typeOfAppointment = typeOfAppointment;
    }
}
