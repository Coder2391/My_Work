import java.util.*;

public class PersonDemo {
	
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter person name: ");
		String name = sc.next();
		System.out.println("Enter person age: ");
		int age = sc.nextInt();
		System.out.println("Enter person gender: ");
		String gender = sc.next();
		System.out.println("Enter person Income: ");
		int income = sc.nextInt();
		
		Person person = new Person();
		person.setName(name);
		person.setAge(age);
		person.setGender(gender);
		person.setIncome(income);
		System.out.println("Before Calculating Tax:");
		System.out.println(person);
		System.out.println("After Tax Calculation:");
		System.out.println(person.toString());
		
		
//		Student std = new Student();
//		
//		std.setName("Ram");
//		std.setEnroll(7002);
//		std.setResult(80);
//		std.setGender("Male");
//			
//		System.out.println(std.toString() +" "+ std.getName() +" "+ std.getGender());
		
		
	}

}
