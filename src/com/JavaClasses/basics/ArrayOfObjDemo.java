package com.JavaClasses.basics;

import java.util.Scanner;

class Students
{
	String name;
	int age;
	
	/**Student()
	{
		System.out.print("default");
	}*/
	
	Students(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	 
}

public class ArrayOfObjDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Student std=new Student();
		//Student st1=new Student("anil",32);
		//Student st2=new Student("mounika",21);
		//Student st3=new Student("nitika",20);
		
		Scanner sc=new Scanner(System.in);
		
		int size=sc.nextInt(); //3
		Students[] students=new Students[size];
		
		for(int i=0;i<size;i++)
		{
			students[i]=new Students(sc.next(), sc.nextInt());
		}
		
		for(int i=0;i<size;i++)
		{
			System.out.println(students[i].name+" "+students[i].age);
		}

	}

}
