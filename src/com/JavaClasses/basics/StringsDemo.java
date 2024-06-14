package com.JavaClasses.basics;

public class StringsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="anil"; // it will allocate memory for anil at different address
		String s2="sunil"; //it will allocate memory for sunil at different address
		
		boolean flag1= s1==s2; //it will verify it belongs to same reference
		boolean flag2= s1.equals(s2); //it will verify value at that reference
		System.out.println(flag1);
		System.out.println(flag2);
		
		String s3="anil"; // it will verify if anil is already present then it will reference to s1
		String s4=s2; // it will be reference to s2
		
		boolean flag4= s3==s1 ; // both belongs to same reference
		boolean flag5= s3.equals(s1); //it will checks the value at reference
		
		System.out.println("s3 "+s3.hashCode());
		System.out.println("s1 "+s1.hashCode());
		System.out.println(flag4);
		System.out.println(flag5);
		
		s3="anil bantu";
		System.out.println("s3 "+s3.hashCode());
		System.out.println("s3 value "+s3);
		boolean flag6= s3.equals(s1); //false
		boolean flag7= s3==s1 ; //false
		
		
       s1=s1+" preeti";//heap
   	   System.out.println("s1 "+s1.hashCode());
   	   
   	   String s6=new String("anil bantu");//heap
   	   String s7="anil bantu";//checks in string const pool
   	   boolean flag8=s6==s3;
   	  boolean flag9=s7==s3;
   	 System.out.println("s6 "+s6.hashCode());
   	 System.out.println("s7 "+s7.hashCode());
   	 System.out.println(flag8);
   	 System.out.println(flag9);
   	 System.out.println(s6.equals(s3));

	}

}
