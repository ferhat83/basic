package zimoutest;

public class Calculation {// blue print class
	// non return method
	public void nonReturnAddition(){
		int a = 2;
		int b = 4;
		int c = a+b;
		System.out.println(" the result is:"+c);
	}
   //return method
	public int returnAddition(int a, int b){
		int total = a+b;
	   System.out.println("the reult is: "+total);
		return total;
		}
	
	  public static void main(String[] args) {// main method
		Calculation cal = new Calculation();// object new Calculation from the blue print class Calculation 
	    cal.nonReturnAddition();// called method 1
	    cal.returnAddition(6, 87);// called method 2
	    
	  }
	}



