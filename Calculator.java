import java.util.*;

public class Calculator {

		public static void main(String args[]) {
			Scanner sc = new Scanner(System.in);
			Operators op = new Operators();
			
			System.out.println("Enter Number1:");
			int num1 = sc.nextInt();
			op.setNo(num1);
			
			System.out.println("Enter Number2:");
			int num2 = sc.nextInt();
			op.setNo1(num2);
			
			op.setSname("Addition");
			int result = op.getAdd();
			System.out.println("Addition is " + result);
			
			op.setSname("Subtraction");
			int result1 = op.getSub();
			System.out.println("Subtraction is " + result1);
			
			op.setSname("Multiplication");
			int result2 = op.getMul();
			System.out.println("Multiplication is " + result2);
			
			op.setSname("Division");
			int result3 = op.getDiv();
			System.out.println("Division is " + result3);
			
//			op.setNo(10);
//			op.setNo1(20);
//			op.setSname("Calculator");
//			System.out.println(op.toString());
		}

}
