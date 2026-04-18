import java.util.Scanner;

public class CheckPalindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Number");
		int num = sc.nextInt();
		int original = num;
		int reverse = 0;
		while (num > 0) {
			int digit = num % 10;
			reverse = reverse * 10 + digit;
			num = num / 10;
		}
		if (original == reverse) {
			System.out.println("The Number is Plaindrome");
		} else {
			System.out.println("Not a Palindrome");
		}

	}

}
