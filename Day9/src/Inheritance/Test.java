package Inheritance;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person P;
		
		P = new Student("Ram", "Avg");
		System.out.println(P.toString());
		
		P = new Employee("Shyam", "Dis");
		System.out.println(P.toString());
		
		boolean B = P instanceof Student;
		System.out.println(B);
		
		boolean B1 = P instanceof Employee;
		System.out.println(B1);
	}

}
