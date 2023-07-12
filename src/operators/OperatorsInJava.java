package operators;

public class OperatorsInJava {
	
	public static void main(String[] args) {
		//Addition operator in character and it concat(join krte character la) the character
		String s1="Tell ";
		String s2="me ";
		String s3="something ";
		String s4="about ";
		String s5="yourself? ";
		String s6=(s1+s2+s3+s4+s5);
		System.out.println(s6);
		
		// Arithmetic operators in numbers
		int n1=29;
		int n2=4;
		//Addition
		System.out.println(n1+n2);
		//Subtraction
		System.out.println(n1-n2);
		//Multiplication
		System.out.println(n1*n2);
		//Division
		//Return Denominator
		System.out.println(n1/n2);
		//Return Numerator 
		System.out.println(n1%n2);
		//character,string and number print in one output
		System.out.println("Adding n1 and n2 in "+(n1+n2)+" will gives?");
		//It gives 294 value of 29+4 because it didn't follow BODMAS rule..for following BODMAS rule always use ()
		System.out.println("Adding n1 and n2 in "+n1+n2+" will gives?");
		
		
		
		//Incremental operator
		int n3=64;
		//n1=29;
		//Ha scenario 1 ni increment krnar 
		n1++;
		System.out.println(n3);
		//Ha scenario pahile tich value denar ji assign keli aahe n1 la ani mg 1 ni increment krnar
		System.out.println(n3++);   //ha same tich value denar
		System.out.println(n3);     // ha ata 1 ni value increment krnar
		//Ha scenario 1 ni pahile increment krnar ani mg print krnar 
				++n3;
		
		//Decrement operator
		n1=29;
		//Ha scenario 1 ni decrement krnar
		n1--;
		System.out.println(n1);
		//Ha scenario pahile tich value denar ji assign keli aahe n1 la ani mg 1 ni decrement krnar
		System.out.println(n1--);   //ha same tich value denar
		System.out.println(n1);     // ha ata 1 ni value increment krnar
		//Ha scenario 1 ni pahile decrement krnar ani mg print krnar 
		--n1;
		
		
		
		//Logical operator
		
		//NOT operator
		System.out.println(!false);
		System.out.println(!true);
		
		//AND Operator
		int atmcard=90876;
		int pwd=1616;
		//1st way to use AND operator
		System.out.println(atmcard==90876 && pwd==1616);
		//2nd way to use AND operator
		if(atmcard==90876 && pwd==1616) {
		System.out.println("Withdraw cash");
		}
		
		//OR operator
		System.out.println(atmcard==90876 || pwd==1616);
		System.out.println(atmcard==90876 || pwd==1000);  //1 tri condition true pahije
		
		
		
		//Relational Operator
		int available=25000;
		int withdraw=26000;
		//equal
		System.out.println(available==withdraw);
		//Not equal
		System.out.println(available!=withdraw);
		//greater than
		System.out.println(available>withdraw);
		//Less than
		System.out.println(available<withdraw);
		//greater than equal to
		System.out.println(available>=withdraw);
		//Less than equal to
		System.out.println(available<=withdraw);
		

	}

}
