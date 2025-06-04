/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_skin_centre;

/**
 *
 * @author Hamza
 */
public class Patient extends Person {
    // instance variable
    private int patientId;

    // constructor
    public Patient(int patientId) {
        super();
        this.patientId = patientId;
    }

    // getters and setters
    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }
}