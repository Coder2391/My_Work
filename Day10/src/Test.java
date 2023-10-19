
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car myCar = new Car("Toyota", 200000);
		
        Driver driver1 = new Driver("Ram", 20);
        driver1.drive(myCar);

        Car myCar1 = new Car("Skoda", 300000);        
        Driver driver2 = new Driver("Shyam", 15);
        driver2.drive(myCar1);
	}

}
