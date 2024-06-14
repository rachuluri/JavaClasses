package com.JavaClasses.basics;

public class StringMethods {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String s1 = "Hello World";
        String s2 = "welcome";
        String s3 = "training,java";
        char ch = s1.charAt(1); //return value at an index
        System.out.println(ch);
        
        int s = s2.compareTo(s1);//if s1 > s2 returns positive number if s1 < s2 returns negative s1 == s2 0
        System.out.println(s);
        
        String newS = s1.concat(s2);//concats the string at end
        System.out.println(newS);
        
        boolean contains = s1.contains("World");//if the word present in string returns true
        System.out.println(contains);
        
        boolean ends = s3.endsWith("ing");//checks if str ends with those chars
        System.out.println(ends);
        
        boolean eq = s1.equals(s2);//checks if both are equal
        System.out.println(eq);

        boolean IgnoreCase = s1.equalsIgnoreCase("hello world");//checks if both are equal, ignoring case
        System.out.println(IgnoreCase);
        
        String formatS = String.format("Formatted: %s", s1);//returns a formatted string
        System.out.println(formatS);
        
        byte[] byteArray = s1.getBytes();//returns byte array of the string
        for(int i=0;i<byteArray.length;i++) {
        	System.out.print(byteArray[i]+" ");
        }
        System.out.println();
        
        char[] charArray = new char[5];
        s1.getChars(6, 11, charArray, 0);//copies chars from string to char array
        for (char c : charArray) {
            System.out.print(c);
        }
        System.out.println();
        
        int index = s1.indexOf("World");//returns index of substring
        System.out.println(index);
        
        String interned = s1.intern();//returns canonical representation(checks for heap and csp) reduces wastage of memory 
        System.out.println(interned);
        
        boolean isEmpty = s1.isEmpty();//checks if string is empty
        System.out.println(isEmpty);
        
        String joined = String.join(", ", "Hello", "World", "Java");//retunrs joined strings with delimiter
        System.out.println(joined);
        
        int lastIndex = s1.lastIndexOf("o");//returns last index of substring
        System.out.println(lastIndex);
        
        int length = s1.length();//returns length of string
        System.out.println(length);
        
        String replaced = s1.replace("World", "Java");//replaces substrings
        System.out.println(replaced);
        
        String replaceAll = s1.replaceAll("o", "O"); // replaces all matching substrings with regex
        System.out.println(replaceAll);
        
        String[] splitArray = s3.split(","); // splits string into array
        System.out.print("split: ");
        for (String sp : splitArray) {
            System.out.print(sp + " ");
        }
        System.out.println();
        
        boolean starts = s1.startsWith("Hel"); // checks if string starts with those chars
        System.out.println(starts);
        
        String substring = s1.substring(6); // returns substring from index
        System.out.println(substring);
        
        char[] toCharArray = s1.toCharArray(); // converts string to char array
        System.out.print("toCharArray: ");
        for (char c : toCharArray) {
            System.out.print(c);
        }
        System.out.println();
        
        String toLowerCase = s1.toLowerCase(); // converts string to lowercase
        System.out.println(toLowerCase);
        
        String toUpperCase = s1.toUpperCase(); // converts string to uppercase
        System.out.println(toUpperCase);
        
        String trim = "   Hello World   ".trim(); // removes leading and trailing spaces
        System.out.println(trim);
        
        String valueOf = String.valueOf(123); // converts value to string
        System.out.println(valueOf);
    }
}
