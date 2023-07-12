package staticAndNonstatic;

public class NonStaticToNonStaticInSameClass {
	
	int k=5;
	public static void main(String[] args) {
		//k=7;
		//System.out.println(k);
	}
	
	public  void SP() {
		AN();                        //Directly call sakte hai
		
	}
	public void AN() {
		
	}

}
