package switchCase;

public class Arithmetic {
	public static void main(String[] args) {
		int choice = 4;
		int a = 7, b = 8;
		switch (choice) {
		case 1:
			System.out.println("Multiplication" + (a * b));
			break;
		case 2:
			System.out.println("Substraction" + (a - b));
			break;
		case 3:
			System.out.println("Addition" + (a + b));
			break;
		case 4:
			System.out.println("Division" + (a / b));
			break;
		}

	}

}
