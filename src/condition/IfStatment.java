package condition;

import java.util.Scanner;

public class IfStatment {

	public static void main(String[] args) {
		//if statement structure: if(condition){body} else{body}
		System.out.println("enter a valid intiger:");
		Scanner sc = new Scanner(System.in);
		int i= sc.nextInt();
		if (i>0) {
			System.out.println("the number is positive");
		}else if (i<0) {
			System.out.println("the number is negative");
		}else  { 
			System.out.println("the number is null");
		
		}
		sc.close();
		

	}

}
