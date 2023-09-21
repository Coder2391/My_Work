
public class TaxCalculator {
	
	public void CalculateTax(Person person) {
		if(person.getAge() > 65 || person.getGender().equalsIgnoreCase("female")) {
			person.setTax(0);
			System.out.println("No Tax");
		} else {
			if(person.getIncome()<=160000) {
				person.setTax(0);
//				System.out.println("Tax is "+ "0%");
			}
			else if(person.getIncome() > 160000 && person.getIncome() <= 500000) {
				person.setTax((person.getIncome()-160000) * 10 / 100);
//				System.out.println("Tax is "+ "10%");
			}
			else if(person.getIncome() > 500000 && person.getIncome() <= 800000) {
				person.setTax((person.getIncome()-160000) * 20 / 100 + 34000);
//				System.out.println("Tax is "+ "20%");
			}
			else {
				person.setTax((person.getIncome() - 800000) * 30 / 100 + 94000);
//				System.out.println("Tax is "+ "30%");
			}
		}
		
	}
}
