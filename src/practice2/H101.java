package practice2;

import java.util.Scanner;

public class H101 {
	 int A;
	 int B;
	public int  addition(){
		int total =  A + B;
		System.out.println("addition result = " +total);
		return total;
	}
	public void substraction(){// non return method 
		int total = A - B;
		System.out.println("substraction result = "+total);		
	}
	public void multiplication() {// non return method 
		int total = A * B;
		System.out.println("multiplication result = "+total);
	}
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);// creation of scanner.
		//input two int for the three operations
		System.out.println("ENTER TWO INTEGERS");// print statement
		H101 zimu = new H101();
		zimu.A=sc.nextInt();
		zimu.B=sc.nextInt();
		zimu.addition();
		zimu.substraction();
		zimu.multiplication();

		// in the next methods we input two different int for each operation.
		System.out.println();// to create empty line in my program
		System.out.println("ENTER TWO INTEGERS for addition");
		H101 add = new H101();// creation of object
		add.A= sc.nextInt();
		add.B=sc.nextInt();//accepting input from keyboard
		add.addition();// call my object
		
		System.out.println();//
		System.out.println("ENTER TWO INTEGERS for substraction");
		H101 sub = new H101();// creation of object
		sub.A= sc.nextInt();
		sub.B=sc.nextInt();//accepting input from keyboard
	    sub.substraction();// cal my object
	    
	    System.out.println();//
	    System.out.println("ENTER TWO INTEGERS for multiplication");
	    H101 mul= new H101();// creation of object
	    mul.A= sc.nextInt();
		mul.B=sc.nextInt();//accepting input from keyboard
		mul.multiplication();// cal my object
		sc.close();
	   }
	}


