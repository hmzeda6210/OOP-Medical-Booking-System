/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_skin_centre;

/**
 *
 * @author Hamza
 */

import java.util.Scanner;

public class Person {
    // instance variables
    protected String name;
    protected String surname;
    protected int mobNumber;
    protected String dob;
    public static Scanner s=new Scanner(System.in);

    // constructor
    public Person() {
        System.out.print("Insert first name                : ");
        this.name = s.nextLine();
        System.out.print("Insert last name                 : ");
        this.surname = s.nextLine();
        System.out.print("Insert date of birth (DD-MM-YYYY): ");
        this.dob = s.nextLine();
        System.out.print("Insert mobile number             : ");
        this.mobNumber = s.nextInt();

    }

    // getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getMobNumber() {
        return mobNumber;
    }

    public void setMobNumber(int mobNumber) {
        this.mobNumber = mobNumber;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    //redefinition of the tostring method to use it when displaying instances
    @Override
    public String toString() {
        return "\nFirst name                  : " + this.name + "\nLast name                   : " + this.surname + "\nDate of birth               : " + this.dob+"\nMobile number               : 0"+this.mobNumber;

    }
}