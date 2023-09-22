import java.util.Scanner;

public class test_pizza {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pizza pz = new Pizza();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Pizza size: ");
		String size = sc.next();
		System.out.println("Enter cheese toppings: ");
		int cheese = sc.nextInt();
		System.out.println("Enter pepproni toppings: ");
		int pep = sc.nextInt();
		System.out.println("Enter hamp toppings: ");
		int hamp = sc.nextInt();
		
		pz.setSize(size);
		pz.setCheese_tops(cheese);
		pz.setPepperoni_tops(pep);
		pz.setHamp_tops(hamp);
		
		int topz = 2*(cheese + pep + hamp);
		pz.setTop_cost(topz);
		
		
		if(pz.getSize().equalsIgnoreCase("small")) {
			pz.setPizza_cost(10);
		}
		else if(pz.getSize().equalsIgnoreCase("Medium")) {
			pz.setPizza_cost(12);
		}
		else {
			pz.setPizza_cost(14);
		}
			
		System.out.println("The Total amount is: " + pz.calcCost());
		System.out.println("The order placed is: " + pz.getDescription());
	}

}
