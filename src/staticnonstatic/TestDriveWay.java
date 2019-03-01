package staticnonstatic;

public class TestDriveWay {
	public static void main(String[] args) {
		House anthony = new House();
		anthony.setdriveWaySize(6);
		int anthonyDriveWaySizeBefore = anthony.getdriveWaySize();
		System.out.println("anthony's drive way size : "+ anthonyDriveWaySizeBefore);
		
		
		House arif = new House();
		arif.setdriveWaySize(8);
		int arifDriveWaySize = arif.getdriveWaySize();
		System.out.println("arif's drive way size : "+arifDriveWaySize);
		
		int anthonyDriveWaySizeAfter = anthony.getdriveWaySize();
		System.out.println("anthony's drive way size : "+ anthonyDriveWaySizeAfter);
		
		House.moveDriveWayDirection();
	}
}
