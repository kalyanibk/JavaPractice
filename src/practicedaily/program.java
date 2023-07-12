package practicedaily;

public class program {
	
	
		
		
		public static void listPrimeNumber(int number) {
			
			
			for(int i=2;i<=number;i++) {
				
				if(isPrimeNumber(i)) {
				
				System.out.println(i);
				
			}
		}
		}
		
		
	
	
	public static boolean isPrimeNumber(int number) {
		
		if(number==0  ||  number==1) {
			
			System.out.println("0 or 1 are not valid");
			return false;
		}
		
		for(int i=2;i<number;i++) {
			
			if(number%i==0) {
				
				System.out.println("Not a Prime Number");
				return false;
			}
		}
		
	
		
		System.out.println("It is a prime number");
	       return true;
		
	}
	
	public static void main(String[]  args) {
		
		isPrimeNumber(89);
		listPrimeNumber(100);
	}
		
		
	
	
	
}