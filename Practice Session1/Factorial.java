
public class Factorial {
	public static void main(String[] args) {
		int i, num = 5, fact = 1;
		for (i = 1; i <= num; i++) {
			fact = fact * i;
			
		}
		System.out.println("factorial of " + num + "is:" + fact);
	}

}
