package practiceQuestion;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		int n=370;
		int temp=n;
		int R, sum=0;
		
		
		while(n>0) {
		R=n%10;
		n=n/10;
		sum=sum+(R*R*R);

	}
		if(temp==sum) {
			System.out.println("It is a Armstrong Number");
			} else {
				System.out.println("Not a Armstrong Number");
			}
		}

}
