package practice;

public class Practice1 {
	
	String stateName; // declaration of variable
    int stateNumber;  //  declaration of variable
	int buildingNumber; // declaration of variable
 
	public  void contry() {
		stateName = "naama";
		System.out.println("this is the state of "+ stateName);
	}
    public void state() {
    	stateNumber = 45;
    	System.out.println("the state number is "+stateNumber);
    }
	public int building() {
		int a = 35; // declaration of int and with = asagnement of 35 as value.
		System.out.println("the building number is "+ a);
		return a;// the return statement most be the last in the methode
	}
	}
