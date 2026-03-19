
public class AlphabetContinue {
	public static void main(String[] args) {
		char ch = 'A';
		for (ch = 'A'; ch <= 'Z'; ch++) {
			if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
				continue;
			}
			System.out.println(ch);

		}
	}

}
