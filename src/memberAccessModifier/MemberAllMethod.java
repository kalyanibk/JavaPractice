package memberAccessModifier;

public class MemberAllMethod {
	
	
	
		
	
	
	public void publicMethod (){
		
	}
	
	 void defaultMethod () {
		
	}
	
	protected void protectedMethod () {
		
	}
	
	private void privateMethod () {
		
	}
		 
	
	public static void main (String[] args) {
		 MemberAllMethod A= new  MemberAllMethod();
		 
		 A.publicMethod();
		 A.defaultMethod();
		 A.protectedMethod();
		 A.privateMethod();
	

}
}
