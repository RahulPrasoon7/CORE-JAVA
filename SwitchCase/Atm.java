package switchCase;

public class Atm {
	public static void main(String[] args) {
		int choice = 2;
		double TotalAmout = 35000;
		switch (choice) {
		case 1:
			System.out.println("Withdraw");
			break;
		case 2:
			System.out.println("Deposite");
			break;
		case 3:
			System.out.println("CheckBalance");
			break;
		}
	}

}
