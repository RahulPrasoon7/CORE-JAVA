package switchCase;

public class Food {
	public static void main(String[] args) {
		int food = 3;
		switch (food) {
		case 1:
			System.out.println("Pizza");
			break;
		case 2:
			System.out.println("Burger");
			break;
		case 3:
			System.out.println("Sandwich");
			break;
		case 4:
			System.out.println("Pasta");
		default:
			System.out.println("Invalid Input");
		}
	}

}
