package switchCase;

public class Department {
	public static void main(String[] args) {
		int department = 5;
		switch (department) {
		case 1:
			System.out.println("Computer Science");
			break;
		case 2:
			System.out.println("Mechanical");
			break;
		case 3:
			System.out.println("Civil");
			break;
		case 4:
			System.out.println("Electrial");
			break;
		default:
			System.out.println("Invalid Input");
		}
	}

}
