package scanner;

import java.util.Scanner;

public class InputFromUse {

	public static void main(String[] args) {
		System.out.println("please enter two numbers:  ");  // print statement.
		Scanner sc = new Scanner(System.in); //create object named sc. the scanner need to be imported 
		int input1 = sc.nextInt();//read int we going to enter in to console
		int input2 = sc.nextInt();//read int we going to enter in to console
		
		sc.close();  // to close tne scanner
		int result = input1 + input2;
		System.out.println("total addistion of the two inputs: " + result);

	}

}
