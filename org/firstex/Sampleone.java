package org.firstex;


public class Sampleone {		//method overloading(different arguments)
	
	public void studentDetails(int roll) {
		
		System.out.println("Student Roll Number is "+roll);

	}
	public void studentDetails(String name) {
		
		System.out.println("Student Name is "+name);

	}
public void studentDetails(String mail, int id) {
		
		System.out.println("Student Mail is "+mail);
		System.out.println("Student ID is "+id);

	}

	public static void main(String[] args) {
		Sampleone j = new Sampleone();
		j.studentDetails(4554);
		j.studentDetails("sabarish");
		j.studentDetails("sabarish447@gmail.com", 12345);
	}
}

