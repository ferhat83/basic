package constructor;

public class ConstructorZimu{
	int size;
	
	//structure of constructor: access specifier className(parameter){body}
    public ConstructorZimu(){//1-default constructor(empty constructor)	
	}
	
	//2-built constructor(non empty or parameterized constructor)
	public ConstructorZimu(int houseSize){
		this.size= houseSize;
		System.out.println(houseSize);
		}

	
	

}
