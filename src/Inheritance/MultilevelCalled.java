package Inheritance;

public class MultilevelCalled {

	public static void main(String[] args) {
		
		Audi h=new Audi ();
		
		
		//Audi
		h.getboschInfotainment();
		h.getAutomaticCleaner();
		h.getMRFtyre();                //ata tikde relation bnvla mnun ata access kru shkt aahe...nusta audi asta 
		                               // mg nhi krta aala asta
		
		// volkswagen ani audi ch kahi relation nhi aahe mnun te access nhi kru shkt
		//audi ch volkswagen sobt relation nhi aahe tr car sobt pn nhi rahanar
		
		
		//volkswagen
		h.getMRFtyre();
	

	}

}
