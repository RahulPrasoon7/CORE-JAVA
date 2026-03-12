package switchCase;

public class Mobile {
	public static void main(String[] args) {
		int mobile = 4;
		switch (mobile) {
		case 1:
			System.out.println("Wifi");
			break;
		case 2:
			System.out.println("Bluetooth");
			break;
		case 3:
			System.out.println("Mobile data");
			break;
		case 4:
			System.out.println("Airplane Mode");
			break;
		default:
			System.out.println("invalid input");
		}
	}

}
