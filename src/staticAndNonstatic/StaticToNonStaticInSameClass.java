package staticAndNonstatic;

public class StaticToNonStaticInSameClass {
	
	//Static to Non-static in same class - directly call kr sakte hai
	
	
		//Number, variable
		static int pin=10;
		
		public static void main(String[] args) {
			System.out.println(pin);
			
		}
			//Method
		
		//Static method
			public static void KP() {
				System.out.println("TRRRRRRRR");
			}
			
			
			//Non-static
			public  void SP() {
				KP();               //Directly call kr sakte hai
			}
			

}
