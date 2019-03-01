package staticnonstatic;

public class House {
 static int driveWaySize = 6;  
	  	
	 public void setdriveWaySize( int driveWaySize) {
	    this.driveWaySize = driveWaySize;
	}
        public int getdriveWaySize() {
	    return driveWaySize;
   }
        public static void moveDriveWayDirection() {
    	System.out.println("Entrence and exit to north ");
 }
}
