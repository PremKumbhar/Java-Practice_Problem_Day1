package com.bridgelabz;

public class StringEqual {
	public static void main(String args[]){  
		   String s1="Hello";  
		   String s2="Hello";  
		   String s3="Hello"; 
		   String s4="Hii";  
		   System.out.println(s1.equals(s2)); 
//		   System.out.println(s1 == s2);      //True
		   System.out.println(s1.equals(s3));
//		   System.out.println(s1 == s3);     //True
		   System.out.println(s1.equals(s4)); 
//		   System.out.println(s1 == s4);    // False
//		   System.out.println(s1 != s4);   // True
		 }  
}
