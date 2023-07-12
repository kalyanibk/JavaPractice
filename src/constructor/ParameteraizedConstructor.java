package constructor;

public class ParameteraizedConstructor {
	
	//Declare variablle
	int cardno;
	int pin;
	int amount;
	
	//Non-Paramaterized
	
	/*
	 public ParameteraizedConstructor() {
		
		System.out.println("Non-Paramatarized Constructor");
	}
	  */
	
	public ParameteraizedConstructor(int cardno,int pin,int amount) {
		
		this.cardno=cardno;
		this.pin=pin;
		this.amount=amount;
	
		
		System.out.println("Parametarized construstor");
	}
	
	public ParameteraizedConstructor(int cardno) {
		this.cardno=cardno;
	}
	
	

	public static void main(String[] args) {
		
		/* 
		 ParameteraizedConstructor aaa= new ParameteraizedConstructor();
		 
		   */
		
		ParameteraizedConstructor a=new ParameteraizedConstructor(1234,1616,2000);
		System.out.println(a.cardno);
		System.out.println(a.pin);
		System.out.println(a.amount);
		System.out.println("**********************************************");
		
		ParameteraizedConstructor aa=new ParameteraizedConstructor(1234);
		System.out.println(aa.cardno);
		System.out.println("***********************************************");
	}

}
