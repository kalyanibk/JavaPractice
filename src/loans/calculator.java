package loans;

public class calculator {
	
	
	public static void main(String[] args) {
		
		calculator calci = new calculator();
		
		calci.doAddition(500,81);
		calci.doSubtraction(800,300);
		calci.doMultiplication(10,10);
		calci.doDivision(2,4);
		
		//System.out.println("The address of variable is" +calci);
		
	}
	
	
	
	public void doAddition(int a,int b) {
		int c= a+b;
		System.out.println("Addition-->"+c);

		}
	public void doSubtraction(int a,int b) {
		int c= a-b;
		System.out.println("Subtraction-->"+c);

		}
	
	public void doMultiplication(int a,int b) {
		int c= a*b;
		System.out.println("Multiplication-->"+c);

	}
	public void doDivision(int a,int b) {
		int c= a/b;
		System.out.println("Division-->"+c);
}
	
	}
