
public class globalAndLocal {
	
	//Global- yala purna class mdhe kuthe pn print krau shkto
	
int global=900;
	
	//Local method
	public void local() {
		
		int locally=907;
		System.out.println(locally);     //ya way ni krav lagte print
		
	}

	
	
	public static void main(String[] args) {
		globalAndLocal gg=new globalAndLocal();
		
		gg.global=00;
		
		gg.locally=99;   //yala bs tyach method mdhe print krav lagte he class mdhe pn print nhi hot
	}

}
