package memberAccessModifier;

import classAccessModifier.DefaultClassLevel;
import classAccessModifier.PublicClassLevel;

public class MethodCallMember {
	public static void main (String[] args) {
		 MemberAllMethod A= new  MemberAllMethod();
		 
		 A.publicMethod();
		 A.defaultMethod();
		 A.protectedMethod();
		 A.privateMethod();
		 
		 //Below are class level modifier
	
			PublicClassLevel p= new PublicClassLevel();
			DefaultClassLevel d= new DefaultClassLevel();
			

	
	}

}
