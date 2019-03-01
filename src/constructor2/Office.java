package constructor2;

public class Office {
	public String address;
	public int officeNum;
	//constractor -1
	public Office() {} // empty constructor or default constractor. take the class name, and it for  initialize of object
	//constructor -2
	public Office(String address) {//non empty constructor with a parametre(String address)
		this.address = address;//this. =is for assingment of the variable of the class.
		System.out.println(address); // statment to display this (address) 
	}
	//constractor -3
	public Office(int address) {//non empty constructor
		this.officeNum = officeNum;
		System.out.println(address);
	}
	public void setAddress(String address) {//non return methode 
		this.address = address;
	}
	public void displayAddress() {//non return methode 
		System.out.println(this.address);
	}
}
