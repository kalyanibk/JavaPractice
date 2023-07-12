package conditional;

public class IfElse {

	public static void main(String[] args) {
		int accountNo=326756;
		int oTP=6161;
		
		//If else
		//            if (accountNo==326756 && oTP==6161) {
		//         System.out.println("Correct OTP");
		//              } else {
		//         	  System.out.println("Incorrect OTP");
		//               }
		

	    
		//ELSE If
		
		if (accountNo==326756 && oTP==6160) {
			        System.out.println("Correct OTP");
			             } else if (oTP==6161) {
			        	  System.out.println("OTP OTP");
			              }else {
			      	    	System.out.println("OTP Incorrect");
			      	    }
		
		
 
	}
}
