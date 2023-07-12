package staticAndNonstatic;

public class StaticToStaticInDifferentClass {
	
  static int k=10;
  
  //Static to static in different class- is mai jo class ki value leni rahi us class ka name.variable or method name.
  // no need to create method here
  
  public static void main(String[] args) {
	  
	  StaticToNonStaticInSameClass.KP();    // method ko call kiya StaticToNonStaticInSameClass is class se
	  StaticToNonStaticInSameClass.pin=200;   // variable ko call kiya StaticToNonStaticInSameClass is class se
  }
  

}
