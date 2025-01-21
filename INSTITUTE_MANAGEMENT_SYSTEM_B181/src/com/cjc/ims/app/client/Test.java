package com.cjc.ims.app.client;

import java.util.Scanner;

import com.cjc.imp.cpp.serviceimpl.Karwenagar;
import com.cjc.ims.app.servicei.Cjc;
 
public class Test {

	public static void main(String[] args) {
		 Cjc ssi=new Karwenagar();
		Scanner sc=new Scanner(System.in);
		while(true) {
			 System.out.println("\nChoose an option:");
	            System.out.println("1. Add Course Info");
	            System.out.println("2. View Course Info");
	            System.out.println("3. Add Faculty Info");
	            System.out.println("4. View Faculty Info");
	            System.out.println("5. Add Batch Info");
	            System.out.println("6. View Batch Info");
	            System.out.println("7. Add Student Info");
	            System.out.println("8. View Student Info");
	            System.out.println("9. Exit");
		System.out.println("Enter the Choice");
		int ch=sc.nextInt();
	
			if(ch==1) {
				ssi.addCourse();
				System.out.println("Course Added Successfully...");
			}
			else if(ch==2){
	            ssi.viewCourse();
	        }
	        else if(ch==3){
	            ssi.addFaculty();
	            System.out.println("Faculty Added Successfully...");
	        }
	        else if(ch==4){
	            ssi.viewFaculty();
	        }
	        else if(ch==5){
	            ssi.addBatch();
	            System.out.println("Batch Added Successfully...");
	        }
	        else if(ch==6){
	            ssi.viewBatch();
	        }
	        else if(ch==7){
	            ssi.addStudent();
	            System.out.println("Student Added Successfully...");
	        }
	        else if(ch==8){
	            ssi.viewStudent();
	        }
	        else if(ch==9){
	         break;
	        }
	        else {
	        	System.err.println("Invalid Choice Plese Enter the Valid Input");
	        }
		
		}
	}
}
