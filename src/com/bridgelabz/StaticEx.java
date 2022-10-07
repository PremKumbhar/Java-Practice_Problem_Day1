package com.bridgelabz;

public class StaticEx {
	static int x = 10;
	static int y;
	
	static void a1(int z) {
	      System.out.println("x = " + x);
	      System.out.println("y = " + y);
	      System.out.println("z = " + z);
	   }
	   static {
	      y = x + 5;
	   }
	   public static void main(String args[]) {
	      a1(8);
	   }
}
