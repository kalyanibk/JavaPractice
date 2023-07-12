package Encapsulation;

public class EncapsulationInDifferentClass {

	

		 private int cardno=987654321;
		private int pin=1616;
		private int amount=90000;
		private int cvv=965;
		
		
		public int getCardno() {
			return cardno;
		}


		public int getAmount() {
			return amount;
		}


		public void setPin(int pin) {
			this.pin = pin;
		}


		// ATM - ATM chi pin change krnya sathi fkt tyach user la access dyav lagel n
		public void updatepin(int cardno,int pin,int newpin) {
			
			if(this.cardno==cardno  && this.pin==pin) {
				 if(this.pin==pin) {
					 setPin(newpin);
				 }
			}
			
		}
		
		
		//method - ATM se paise nikalne
		
		public void withdraw(int cardno,int pin,int amount) {
			
			if(this.cardno==cardno  && this.pin==pin) {
				
				if(this.amount>=amount) {
					System.out.println("withdraw cash");
					this.amount=this.amount-amount;               //jo cash nikli usko subtract krke bank ke amount pe dal do
				}  else {
					System.out.println("Insufficient fund!!!!");
				}
			}
			else {
					System.out.println("Invalid details-----blocked");
				}
				
				}
		

	}


