package loops;

public class ForLoop {

	public static void main(String[] args) {
		
		String[] names= new String[5];
		
		System.out.println("Kongre Family");
		
		names[0]="Leelabai";
		names[1]="Bhalchandra";
		names[2]="Sangita";
		names[3]="Kalyani";
		names[4]="Khushwant";
		
		for(String n:names) {
			System.out.println(n);
		}
		
	}

}



