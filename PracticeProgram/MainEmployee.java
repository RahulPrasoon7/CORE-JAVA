
public class MainEmployee {
	public static void main(String[] args) {
		Employee e1 = new Employee();
		System.out.println("Employee id is :" + (e1.id = 121));
		System.out.println("Employee Salary:" + (e1.salary = 40000));
		if (e1.salary >= 50000) {
			System.out.println("High Salary");
		} else {
			System.out.println("Low Salary");
		}
	}
}
