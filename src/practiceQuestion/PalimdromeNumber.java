package practiceQuestion;

public class PalimdromeNumber {

	public static void main(String[] args) {
		
		int n=121;
		int temp=n;
		int reverse=0,Remender;
		
		while(n>0) {
			
			Remender=n%10;
			n=n/10;
			reverse=(reverse*10)+Remender;
			}
		
          if(temp==reverse) {
        	  System.out.println("It is a Palimdrome Number");
          }else {
        	  System.out.println("Not a Palimdrome Number");
          }
	}

}
