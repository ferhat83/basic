package practice;


public class Practice2 {
	
	static String stateName; // declaration of global variable as static 
    static int stateNumber;  //  declaration of global variable as static 
	static int buildingNumber; // declaration of variable
 
	public static void contry() {
		stateName = "naama";
		System.out.println("this is the state of "+ stateName);
	}
    public static void state() {
    	stateNumber = 45;
    	System.out.println("the state number is "+stateNumber);
    }
	public static int building() {//declaration of method as static because we used just local variable.
		int a = 35; // declare  int and with = asagnement of 35 as value.
		System.out.println("the building number is "+ a);
		return a;// the return statement most be the last in the method
	}
	}


