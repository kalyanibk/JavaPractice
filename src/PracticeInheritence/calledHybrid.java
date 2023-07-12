package PracticeInheritence;

public class calledHybrid {

	public static void main(String[] args) {
		GrandchildrenAudi q=new GrandchildrenAudi();
		
		q.getredcolor();    //car              parents
		q.d=600;            //car
		
		q.getradio();       //volkswagen          child
		q.getMRFTyres();    //volkswagen
		
		q.wheels=60000;      //Audi                Grandchild
	   q.getscreen();        //Audi
	   
	   jaugar i=new jaugar();   //Another Child
	   i.getseat();
		
		

	}

}
