
package oop_skin_centre;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Hamza
 */




public class WestminsterSkinConsultationManager implements SkinConsultationManager{
    // instance variable
    private List<Doctor> doctors;

    // constructor
    public WestminsterSkinConsultationManager() {
        doctors = new ArrayList<>();
    }

    // add a new doctor
    public void addDoctor() {
        if (doctors.size() < 10) {
        	Doctor a= new Doctor();
            doctors.add(a);
        } else {
            System.out.println("Maximum number of doctors reached.");
        }
    }

    // delete a doctor by license number
    public void deleteDoctor() {
    	Scanner s=new Scanner(System.in);
    	String nb;
    	System.out.print("Insert the license number of this doctor : ");
		nb = s.nextLine();
        for (Doctor d : doctors) {
            if (d.getLicenceNumber().equals(nb)) {
            	System.out.println("\nthe doctor is well removed : \n"+d.toString());
            	doctors.remove(d);
                Doctor.n = Doctor.n - 1;
            	System.out.println("\nthe number of doctor is : "+Doctor.n);
                return;
            }
        }
		System.out.println("\nthis doctor does not exist!!!!!");
    }

    // print the list of doctors
    public void printDoctors() {
    	System.out.println("\nthe number of doctor is : "+Doctor.n);
        for (Doctor p : doctors) {
            System.out.println(p.toString());
        }
    }

    // save the list of doctors to a file
  public void saveDoctorsToFile() throws IOException {
	  
	File f = new File("C:\\Users\\Hamza\\Desktop\\file.txt");
	FileWriter fw = new FileWriter(f);
	PrintWriter pw = new PrintWriter(fw);
	pw.print("the number of doctor is : "+Doctor.n);
        for (Doctor p : doctors) {
            pw.print(p.toString());
        }
        System.out.println("The file has been saved successfully");
        pw.close();
	  
   }


    
    
    
    public static void main(String[] args) {
    	WestminsterSkinConsultationManager g = new WestminsterSkinConsultationManager();
    	Scanner s=new Scanner(System.in);
        int option;

        do {
            System.out.println("\nMENU:");
            System.out.println("1. Add a new doctor.");
            System.out.println("2. Delete a doctor.");        
            System.out.println("3. Print the list of the doctors.");           
            System.out.println("4. Save in a file.");  
            System.out.println("5. Open GUI.");
            System.out.println("6. End program. \n");         
            System.out.print("Enter Your Choice : ");

            option = s.nextInt();

            switch (option) {
                case 1:
                    g.addDoctor();;
                    break;
                case 2:
                    g.deleteDoctor();
                    break;
                case 3:
                    g.printDoctors();
                    break;
                case 4:
                    try {
                        g.saveDoctorsToFile();
                    } catch (IOException e) {
                        // TODO Auto-generated catch block
                        System.out.print(e.getMessage());
                    }
                    break;
                case 5:
                	break;
                case 6:
                    System.out.println("Program Terminated");
                    break;
                default:
                    System.out.println("Incorrect choice");
                    break;
            }
        } while (option != 6);
    }

}
