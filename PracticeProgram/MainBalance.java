
public class MainBalance {
	public static void main(String[] args) {
		Balance B1 = new Balance();
		System.out.println("Balance is :" + (B1.balance = 1000));
		if (B1.balance <= 1000) {
			System.out.println("Low Balance ");
		}
	}
}
