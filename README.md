# Skin Consultation Manager

## Overview
The Westminster Skin Consultation Manager is a Java-based console application designed to help manage doctors, patients, and consultations at a skin consultation centre. The system allows users to add, delete, and view doctors, as well as save doctor information to a file. The project is structured for easy extension, including the potential for a GUI interface.

## Features
- **Add Doctor**: Input and store new doctor details, including name, surname, date of birth, mobile number, specialization, and license number.
- **Delete Doctor**: Remove a doctor from the system using their license number.
- **Print Doctors**: Display a formatted list of all registered doctors.
- **Save to File**: Persist the current list of doctors to a text file for record-keeping.
- **Extensible Design**: Built with interfaces and inheritance for easy future expansion (e.g., adding GUI or more features).

## Project Structure
```
src/
├── oop_skin_centre/
   ├── Consultation.java
   ├── Doctor.java
   ├── Patient.java
   ├── Person.java
   ├── SkinConsultationManager.java
   └── WestminsterSkinConsultationManager.java
```

- **Person.java**: Base class for all people in the system (doctors, patients).
- **Doctor.java**: Extends Person, adds specialization and license number.
- **Patient.java**: Extends Person, adds patient ID.
- **Consultation.java**: Represents a consultation with date, time, cost, and notes.
- **SkinConsultationManager.java**: Interface defining core management operations.
- **WestminsterSkinConsultationManager.java**: Main implementation class with a console menu.

## How to Run

### Compile the Project:
Use your IDE or run `ant build` if using Apache Ant.

### Run the Application:
Execute the `WestminsterSkinConsultationManager` main class.
You will be presented with a menu to manage doctors.

## Example Usage
- **Add a Doctor**: Enter the required details when prompted.
- **Delete a Doctor**: Provide the license number of the doctor to remove.
- **Print Doctors**: View all doctors currently in the system.
- **Save to File**: Save the doctor list to file.

## Requirements
- Java 17 or higher
- (Optional) Apache Ant for building via build.xml

## Learning Outcomes
- **Object-Oriented Programming (OOP)**: Implementation of core OOP principles including encapsulation, inheritance, and polymorphism
- **Interface Design**: Creating and implementing interfaces for system extensibility
- **File I/O Operations**: Reading from and writing to files for data persistence
- **Data Structures**: Using collections to manage and organize data
- **Console Application Development**: Building interactive command-line interfaces
- **Software Design Patterns**: Applying proper class hierarchies and modular design
