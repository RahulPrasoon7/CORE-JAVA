
public class PracticeSession {
	public static void main(String[] args) {
		int choice, i;
		do {
			System.out.println("1.Print Number");
			System.out.println("2.Print Even Number");
			System.out.println("3.Print odd Number");
			System.out.println("4.Exit");
			choice = 1;

			switch (choice = 0) {
			case 1:
				for (i = 0; i <= 10; i++)
					System.out.println("Print Numbers" + i);
				break;
			case 2:
				for (i = 0; i <= 10; i++)
					if (i % 2 == 0)
						System.out.println("Even Number" + i);
				break;
			case 3:
				for (i = 0; i <= 10; i++)
					if (i % 2 != 0)
						System.out.println("Odd Number");
				break;
			case 4:
				System.out.println("Exit");
				break;
			default:
				System.out.println("Invalid choice");
			}
		} while (choice != 4);

	}
}
