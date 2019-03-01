package practice2;

import java.util.Scanner;

public class H100 {
   static int A;
   static int B;
    
		public int addition(int A, int B ) {
			int total= A + B;
			System.out.println(" the result is : "+ total);
			return total;
			
		}
		public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				System.out.println("please enter 2 integrs");				
				H100 add = new H100();
				add.addition( A = sc.nextInt(), B = sc.nextInt() );			
				sc.close();
		}
	}


