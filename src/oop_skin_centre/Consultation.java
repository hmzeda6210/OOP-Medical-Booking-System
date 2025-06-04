/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_skin_centre; 
import java.util.Date;

/**
 *
 * @author Hamza
 */



public class Consultation{
    // instance variables
    private Date date;
    private String time;
    private double cost;
    private String notes;

    // constructor
    public Consultation(Date date, String time, double cost, String notes) {
        this.date = date;
        this.time = time;
        this.cost = cost;
        this.notes = notes;
    }

    // getters and setters
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}
