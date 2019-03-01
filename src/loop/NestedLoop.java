package loop;

public class NestedLoop {
        // nested loop is a loop witch have an other loop inside.
	public static void main(String[] args) {
      int i, j;
      for(i=0; i<5; i++) {
    	  for(j=0; j<i; j++) {
    		  System.out.print("*");
    	  }
    	  System.out.println("*");
 
      }
    	  
	}

}
