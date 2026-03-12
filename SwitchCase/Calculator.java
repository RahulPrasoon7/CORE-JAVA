package switchCase;

public class Calculator {
	public static void main(String[] args) {
		int choice = 1;
		int a = 5, b = 7;
		switch (choice) {
		case 1:
			System.out.println("Addition" + (a + b));
			break;
		case 2:
			System.out.println("Multiplication" + (a * b));
			break;
		case 3:
			System.out.println("Division" + (a / b));
			break;
		case 4:
			System.out.println("Subtraction" + (a - b));
			break;

		}

	}

}
