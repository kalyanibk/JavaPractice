package practicedaily;

public class Constructor {
	
	int cardno;
	int pin;
	int amount;
	
	public Constructor() {
		System.out.println("Non-Parametarize");
	}
	
	public Constructor(int cardno,int pin,int amount) {
		System.out.println("Parametarize");
		
		this.cardno=cardno;
	    this.pin=pin;
		this.amount=amount;
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		
		Constructor o=new Constructor();
		
		Constructor a=new Constructor(987654321,1616,90000);
		
		System.out.println(a.cardno);
		System.out.println(a.pin);
		System.out.println(a.amount);
		
		
		
	}

}
