import java.util.*;

public class test_employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Employee emp = new Employee();
        
		System.out.println("Enter the Salary: ");
		int sal = sc.nextInt();
		emp.setSalary(sal);
		
		System.out.println("Enter the Working Hours: ");
		int hr = sc.nextInt();
		emp.setWork_hrs(hr);
		
//		emp.getInfo(450, 8); // Replace with actual salary and hours worked per day
		emp.AddSal();
       	emp.AddWork();
       	
        int finalSalary = emp.calculateFinalSalary();
        System.out.println("Final Salary: $" + finalSalary);
	}

}
