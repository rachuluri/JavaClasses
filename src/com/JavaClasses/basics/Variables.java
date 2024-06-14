package com.JavaClasses.basics;
import java.util.*;
class Sample {
	int num;
	String name;
}
public class Variables {
	int b;
	static int c;
	public static void main(String args[]) {
		Sample s1 = new Sample();
		s1.num=10;
		s1.name="abc";
		System.out.println(s1.num+s1.name);
		Variables v = new Variables();
		System.out.println(v.b);
		Variables.c=100;
		System.out.println(Variables.c);
	}
}
