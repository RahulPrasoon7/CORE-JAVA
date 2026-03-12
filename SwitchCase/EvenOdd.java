package switchCase;

public class EvenOdd {
	public static void main(String[] args) {
		int a = 28;
		switch (a % 2) {
		case 0:
			System.out.println("The Number is Even");
			break;
		case 1:
			System.out.println("The Number is Odd");
			break;
		}
	}

}
