package practiceQuestion;

public class PrimeNumber {
	
	//Method
	public static boolean isPrimeNumber(int number) {
		
		if(number==0 || number==1) {
			System.out.println("0 or 1 are not eligible");
			return false;
		}
		
		for(int i=2;i<number;i++) {
			if(number%i==0) {
				System.out.println("Not a prime Number");
				return false;
			}
		}
		System.out.println("It is a prime Number");
		return true;
	}
	
	//Method- to print all the number which are come under the given input number for below method
	
	public static void listofPrimeNumber(int number) {
		
		for(int i=2;i<=number;i++) {
			if(isPrimeNumber(i)){
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		
		isPrimeNumber(97);
		listofPrimeNumber(100);

	}

}
