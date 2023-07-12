package classAccessModifier;

import memberAccessModifier.MemberAllMethod;
import memberAccessModifier.ProtectedInheritence;

public class CheckingProtectedParentClass extends MemberAllMethod {
	

public static void main(String[] args) {
		
	CheckingProtectedParentClass A = new CheckingProtectedParentClass();		
		
	 A.publicMethod();
	 A.defaultMethod();
	 A.protectedMethod();
	 A.privateMethod();
		
		
	}

}
