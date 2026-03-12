package switchCase;

public class Language {
	public static void main(String[] args) {
		int choice = 3;
		switch (choice) {
		case 1:
			System.out.println("Java");
			break;
		case 2:
			System.out.println("Python");
			break;
		case 3:
			System.out.println("c++");
			break;
		case 4:
			System.out.println("JavaScript");
			break;
		default:
			System.out.println("invalid choice");
		}
	}

}
