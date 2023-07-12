package Encapsulation;

public class CallInDifferentClass {

	public static void main(String[] args) {
		
		EncapsulationInDifferentClass d=new EncapsulationInDifferentClass();
		
		d.withdraw(987654321,1616,90000);
		
		// d.pin=9090;  -- hacked type
		
		d.updatepin(987654321,1616,90000);
	}

}
