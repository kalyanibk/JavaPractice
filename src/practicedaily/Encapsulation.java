package practicedaily;

public class Encapsulation {
	
	private int cardno=987654321;
	private int pin=1616;
	private int cvv=946;
	private int amount=90000;
	
	
	
	
	
	public int getCardno() {
		return cardno;
	}



	public int getAmount() {
		return amount;
	}



	public void setPin(int pin) {
		this.pin = pin;
	}



	public void withdraw(int cardno,int pin,int amount) {
		
		if (this.cardno==cardno  &&  this.pin==pin) {
			
			if(this.amount>=amount) {
				
				System.out.println("Withdraw cash");
				this.amount=this.amount-amount;
			} else {
				
				System.out.println("Insufficient Fund!!!!!!!");
			} 
		}else {
			
			System.out.println("Invalid Details-----Blocked");
		}
		
		
	}

	
	
	public void updatepin(int cardno,int pin,int newpin) {
		
		if (this.cardno==cardno  &&  this.pin==pin) {
			
			if(this.pin==pin) {
				
				setPin(newpin);
			}
			
		}
		else {
			
			System.out.println("not allowed");
		}
		
		
		}
	
	
	public static void main (String[] args) {
		
		Encapsulation r=new Encapsulation();
		r.updatepin(987654321,4569,1616);
		
		r.withdraw(987654321,1616,60000);
	}

}
