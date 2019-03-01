package prctice3;

public class Samsung extends Option implements Mobile{

	
	public void storage() {
		int a=64;
      	System.out.println(" the storage is "+a+"GB");
		}
	public String brand() {
		String br= "note8";
		System.out.println(" this phone is : "+br);
     	return br;
		}
	public void camera() {
		String cam="16 mp";
		System.out.println("this phone camera is "+ cam);
		}
	public void mretiel() {
			System.out.println("we are using plastic mateiels");
		   }
	public void colors() {
		System.out.println("we offer 4 colors");
		
		   }
	  
		}

