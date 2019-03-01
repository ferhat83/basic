package house;

public class TesthHouse {

	public static void main(String[] args) {
		House myHouse = new House();
		myHouse.watchGame();
	    int result = myHouse.addition(10,15);// 
	    System.out.println(result);
		
		Office pnt = new Office();
		pnt.officeLocation();
		
		House yourHouse = new House();
		yourHouse.watchGame();
		
	  }
	}


