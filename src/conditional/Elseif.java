package conditional;

public class Elseif {

	public static void main(String[] args) {
	
		String UN="Kalyani";
		String PW="Kalyani123";
		
		if(UN.equals("Kalyani") && PW.equals("Kalyani123")) {
			System.out.println("Allow to login");
		} else if (UN.equals("Kalyani") && !PW.equals("Kalyani123")) {
			System.out.println("pls put correct password");
		} else if (!UN.equals("Kalyani") && PW.equals("Kalyani123")) {
			System.out.println("our record show you are not our customer pls login using given below link");
		}
		
		
	}

}



  
