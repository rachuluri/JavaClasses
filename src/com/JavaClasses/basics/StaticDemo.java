package com.JavaClasses.basics;
class Student {
	int rno;
	String name;
	String branch;
	double cgpa;
	static String college;
	static String uni;
}
public class StaticDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		s1.rno=555;
		s1.name="abc";
		s1.branch="CSE";
		s1.cgpa=8.2;
		Student.college = "BVRITH";
		Student.uni="JNTUH";
		System.out.println(s1.name+" "+s1.rno+" "+s1.branch+" "+s1.cgpa+" "+Student.college+Student.uni);
		Student s2 = new Student();
		s2.rno=534;
		s2.name="xyz";
		s2.branch="ECE";
		s2.cgpa=8.3;
		System.out.println(s2.name+" "+s2.rno+" "+s2.branch+" "+s2.cgpa+" "+Student.college+Student.uni);
	}

}
