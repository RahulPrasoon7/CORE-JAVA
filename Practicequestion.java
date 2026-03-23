
public class Practicequestion {
	public static void main(String[] args) {
//		int num = 1234;
//		int reverse = 0;
//		while (num != 0) {
//			int digit = num % 10;
//			reverse = reverse * 10 + digit;
//			num = num / 10;
//		}
//		System.out.println("Reversed number:" + reverse);
//		int num = 152;
//		int original = num;
//		int reverse = 0;
//		while (num != 0) {
//			int digit = num % 10;
//			reverse = reverse * 10 + digit;
//			num = num / 10;
//		}
//		if (original == reverse) {
//			System.out.println("Palindrome number");
//
//		} else {
//			System.out.println("Not a palindrome");
//		}
		int n = 10;
		int first = 0, second = 1;
		for (int i = 1; i <= n; i++) {
			System.out.println(first + "");
			int next = first + second;
			first = second;
			second = next;
		}

	}
}
