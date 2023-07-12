package conditional;

public class Switch {

	public static void main(String[] args) {
		int day=7;
		switch(day) {
		
		case 1:
			System.out.println("Monday");
			System.out.println("case 1");
			break;
			
		case 2:
			System.out.println("Tuesday");
			System.out.println("case 2");
			break;
			
		case 3:
			System.out.println("Wednesday");
			System.out.println("case 3");
			break;
			
		case 4:
			System.out.println("Thursday");
			System.out.println("case 4");
			break;
			
		case 5:
			System.out.println("Friday");
			System.out.println("case 5");
			break;
			
		case 6:
			System.out.println("Saturday");
			System.out.println("case 6");
			break;
			
		case 7:
			System.out.println("Sunday");
			System.out.println("case 7");
			break;
			
			default:
				System.out.println("No matching value");
				break;
		}

	}

}
