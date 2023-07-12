package PracticeInheritence;

public class calledHierarchy {

	public static void main(String[] args) {
		
		jaugar t= new jaugar();
		
		t.getredcolor();    //car              parents
		t.d=600;            //car
		System.out.println(t.d);
		
		t.getradio();       //volkswagen          child
		t.getMRFTyres();    //volkswagen
		
	     t.getseat();         //another child

	}

}
