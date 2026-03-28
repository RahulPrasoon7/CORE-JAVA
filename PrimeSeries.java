
public class PrimeSeries {
	public static void main(String[] args) {
		int limit = 100;
		for (int i = 1; i <= limit; i++) {
			int count = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count == 2) {
				System.out.println("" + i);
			}

		}

	}

}
