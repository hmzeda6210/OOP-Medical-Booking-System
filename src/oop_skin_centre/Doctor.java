/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_skin_centre;

/**
 *
 * @author Hamza
 */

public class Doctor extends Person {
    // instance variables
    private String specialization;
    private String licenceNumber;
    public static int n = 0; //counts the doctors number

    // constructor
    public Doctor() {
        super(); 
        Doctor.n = Doctor.n + 1; 
        s.nextLine();
		System.out.print("Insert doctor specialization     : ");
		this.specialization = s.nextLine();
		System.out.print("Insert doctor licence number     : ");
		this.licenceNumber = s.nextLine();
    }

    // getters and setters
    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getLicenceNumber() {
        return licenceNumber;
    }

    public void setLicenceNumber(String licenceNumber) {
        this.licenceNumber = licenceNumber;
    }
    

    //redefinition of the totring method to use it when displaying instances
    @Override
    public String toString() {
        return "\n\t------------------------\n" +  super.toString() + "\ndoctor's specialization     : " + this.specialization+ "\ndoctor's license number     : "+this.licenceNumber;

    }
    
}


