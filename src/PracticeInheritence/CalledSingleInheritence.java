package PracticeInheritence;

public class CalledSingleInheritence {

	public static void main(String[] args) {
		
		childVolkswagen b=new childVolkswagen();
		
		b.s=800;      //volkswagen
		b.d=600;      //car
		
		b.getradio();       //volkswagen
		b.getMRFTyres();    //volkswagen
		
		b.getredcolor();     //car
		
	}
}
