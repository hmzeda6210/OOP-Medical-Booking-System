/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package oop_skin_centre;
import java.io.IOException;

/**
 *
 * @author Hamza
 */

public interface SkinConsultationManager {
	   
  public  void addDoctor();
  public  void deleteDoctor();
  public  void printDoctors();
  public  void saveDoctorsToFile() throws IOException;  

}
