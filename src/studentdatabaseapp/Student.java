package studentdatabaseapp;

import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private int gradeYear;
	private int studentID;
	private String course;
	private int tuitionBalance;
	private int costOfCourse = 600;
	private String status;
	
	
	//Constructor prompt user to enter student's name and year Scabn
	public Student() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter student first name: ");
		this.firstName = in.nextLine();
		
		System.out.println("Enter student last name: ");
		this.lastName = in.nextLine();
		
		System.out.println("1- Freshman \n2 - Sophmore\n3 - Junior\n4 - Senior student grade level: ");
		this.gradeYear = in.nextInt();
		System.out.println(firstName + " " + lastName + " " + gradeYear);
	}
	
	
	
	//Generate an ID
	
	//Enroll in courses
	
	//View balance
	
	//Pay tuition
	
	//Show status

}
