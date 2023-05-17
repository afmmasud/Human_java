package lyft.usa.com;

public class VerifyTheValus {

	// How I do verify the expected value
	// By java if else condition



		public static void main(String[] args) {
		//Masud want sale more then $200
		//Masud want buy less then $200
		int computerprice = 199;
		
		if (computerprice > 200) {
			System.out.println("Masud slae his computer");
		}
		
	     else if (computerprice < 200) {
	    	System.out.println("Masud buy the computer"); 
	     }

	else if (computerprice == 200) {
		System.out.println("Masud want to sle his computer by buying price");
	}

	else {
		System.out.println("Masud didn't buy or sale computer");
		}
}
}		
	
	
		
		
		