package PracticeInheritence;

public class calledMultiLevel {

	public static void main(String[] args) {
		
		GrandchildrenAudi f=new GrandchildrenAudi();
		
		f.getredcolor();    //car              parents
		f.d=600;            //car
		
		f.getradio();       //volkswagen          child
		f.getMRFTyres();    //volkswagen
		
		f.wheels=60000;      //Audi                Grandchild
	   f.getscreen();        //Audi
		
		
		
	}

}
