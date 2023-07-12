package staticAndNonstatic;

public class NonStaticToNonStaticInDifferentClass {
int y=4;
	
	public static void main(String[] args) {
		StaticToNonStaticInSameClass g=new StaticToNonStaticInSameClass();
		NonStaticToStaticInSameClass f=new NonStaticToStaticInSameClass();
		g.SP();      //jya class mdhun call krto tya class ch name object create krtani pahije madhe pahije
		f.u=8;
	}

}
