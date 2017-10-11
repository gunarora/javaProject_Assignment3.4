/*assignment for  Methods, Constructor, Inheritance and  Encapsulation*/
package javaProject_Assignment3; //Package declaration is mandatory

import java.math.BigInteger;
//Scanner Class imported
import java.util.Scanner;

public class Student {
	//Declare private variables
private String Name;
private BigInteger phone_number;
private int roll_number;
private String class_Name;	

//Getters and setters for variables
//Using Private variables and properties is encapsulation
public String getName() {
	return Name;
}

public void setName(String name) {
	Name = name;
}


public BigInteger getPhone_number() {
	return phone_number;
}

public void setPhone_number(BigInteger phone_number) {
	this.phone_number = phone_number;
}


public int getRoll_number() {
	return roll_number;
}

public void setRoll_number(int roll_number) {
	this.roll_number = roll_number;
}


public String getClass_Name() {
	return class_Name;
}

public void setClass_Name(String class_Name) {
	this.class_Name = class_Name;
}




//Main method started
public static void main(String[] args) {
	//Object creating of class
	 Student student = new Student();
	 // Scanner to take input  from the user.
     Scanner scanner = new Scanner(System.in);
     
     System.out.println("Enter Name: ");
     //Input the string variable
     String name = scanner.nextLine();
     //Set value in property
     student.setName(name);
     
     System.out.println("Enter roll number: ");
     ////Input the int variable
     int rollNumber = scanner.nextInt();
     //Set value in property
     student.setRoll_number(rollNumber);     
     
     
     System.out.println("Enter Phone number: ");
     //Input the BigInteger variable
     BigInteger phoneNumber = scanner.nextBigInteger();
     //Set value in property
     student.setPhone_number(phoneNumber);
     
     System.out.println("Enter Class Name: ");
     //Input the string variable
     String className = scanner.next();
     //Set value in property
     student.setClass_Name(className);
     
    //Now applying the logic as stated in the assignment and print values of Private members using properties
   
     System.out.println("Name: " + student.getName());
     System.out.println("Roll Number: " + student.getRoll_number());
     System.out.println("Phone Number: " + student.getPhone_number());
     System.out.println("ClassName: " + student.getClass_Name());
     //Scanner class close
     scanner.close();
}

}
