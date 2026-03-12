package switchCase;

public class TrafficLight {
	public static void main(String[] args) {
		String color = "yellow";
		switch (color) {
		case "Red":
			System.out.println("Stop... !");
			break;
		case "yellow":
			System.out.println("Ready... !");
			break;
		case "green":
			System.out.println("Go ...!");
			break;

		}
	}

}
