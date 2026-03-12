package switchCase;

public class Grade {
	public static void main(String[] args) {
		char grade = 'D';
		switch (grade) {
		case 'A':
			System.out.println("Excellent");
			break;
		case 'B':
			System.out.println("Good");
			break;
		case 'C':
			System.out.println("Average");
			break;
		case 'D':
			System.out.println("Pass");
			break;
		default:
			System.out.println("Fail... !");
		}
	}

}
