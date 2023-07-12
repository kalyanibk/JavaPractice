package BreakAndContinue;

public class Break {

	public static void main(String[] args) {
		String[] names=new String[9];
		
		names[0]="Kalyani";
		names[1]="Tanaya";
		names[2]="Harshali";
		names[3]="Megha";
		names[4]="Shradha";
		names[5]="Chitika";
		names[6]="Prachi";
		names[7]="Payal";
		names[8]="sayali";
		
		for(String n: names) {
			
			System.out.println(n);
			System.out.println("****************");
			if(n=="megha") {
				System.out.println("Name Found");
				break;
			}
			
		}
		
		

	}

}
