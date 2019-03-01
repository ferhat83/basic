package constructor2;

public class OfficeTest {

	public static void main(String[] args) {
	Office office1 = new Office();// create object     
	office1.setAddress("1010 west side ave");// set address
	office1.displayAddress();// display address using method of display
		/* the last 3 statments are created to initialize the object offoce1 using 2 methods
		 * methode1 is setAddress methode2 is displayAddress.
		 * 
		 */
	
	
	  // same work using constructors 
	Office office2 = new Office("123 houston st");// create an object and intalize it using constractor2
	Office officenum = new Office("35");// create an object and initialize it u sing constracto3
	/*the benifit of using a constructor is to initialize an object and display it using just one line codes
	 *  ex an line 15 and line 16 
	 * 
	 */
	}
}
