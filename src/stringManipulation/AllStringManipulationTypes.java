package stringManipulation;

public class AllStringManipulationTypes {

	public static void main(String[] args) {
		String s1 = "Nagpur is the new IT Hub of India at the Mihan in short span of time";
		String s2 = "Nagpur is also known as orange City";
		String s3 = "Nagpur Is the good in greenary";
		
		
		//Length- It show the total character present in the above string include space also
		
		System.out.println(s1.length());
		
		
		
		//Index of- It show the the mention character is present at which number- number mai aayega answer
		
		System.out.println(s1.indexOf('i'));
		System.out.println(s1.indexOf("new"));
		
		
		
		//agar sentence mai ek character repeat ho raha hai...1st ki value pta chalne ke baad next time 
		//woh character konse number pe aata hai yeh dekhne ke liye
		
		System.out.println(s1.indexOf('i',s1.indexOf('i')+1));
		System.out.println(s1.indexOf("new",s1.indexOf("new")+1));
		
	
	   
		//Char at- ismai konse number pe konsa konsa character hai woh btata hai- character mai aayega answer
		
		System.out.println(s1.charAt(10));
		System.out.println(s1.charAt(5));
		
		
		
		//Comparision - equals or equalsIsIgnoreCase
		
		/*System.out.println(s1.equals(s2));   // 
		System.out.println(s1.equals(s3));   //
		System.out.println(s1.equalsIgnoreCase(s3)); */  //upper case lower case ignore krte fkt ekhadi letter wronge kiva kami rahala tr error denar
	
		
		
		//Substring- starting and ending position of the string
		
		System.out.println(s1.substring(6));    //start at the 6th letter of the sentence and end at the sentence
		System.out.println(s1.substring(11,53));  ////start at the 11th letter of the sentence and end at the 53rd position of the character
		
		
		
		//Trim - He donhi side chi space delete krte pn fkt starting and ending chi 
		
		String trimmers = "       Nagpur is the It Hub of India at the Mihan in short span of time      ";
		System.out.println(trimmers.trim());
		
		
		
		//Replace 
		
        System.out.println(trimmers.replace(" ", "_"));
		System.out.println(trimmers.replace(" ", ""));
		System.out.println(trimmers.replace("of","OFF"));
		
		
		
		//Concatination- string la jodne
		
		String k="ARC_Tech_Institute_Nandanvan";
		String conca=s1.concat(k);  //conca ki jagah konsa bhi variable le sakte hai
		System.out.println(conca);
		
		 s1=s1+s2+s3+k;  // Addition se bhi string join ho jati hai
		
		
		
		//Split
		
        String a="ARC_Tech_Institute_Nandanvan";
		
		String[] str=a.split("_");   //kaha se split krna hai
		
		for(String s:str) {
			
			System.out.println(s);
		}
	}

}
