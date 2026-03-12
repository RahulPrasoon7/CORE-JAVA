package switchCase;

public class Login {
	public static void main(String[] args) {
		int choice = 4;
		switch (choice) {
		case 1:
			System.out.println("Login");
			break;
		case 2:
			System.out.println("Register");
			break;
		case 3:
			System.out.println("Profile");
			break;
		case 4:
			System.out.println("Logout");
			break;
		default:
			System.out.println("Invalid input");
		}
	}

}
