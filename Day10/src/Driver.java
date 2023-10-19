
public class Driver {
	private String name;
    private int age;

    public Driver(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void drive(Car car) {
        if (age >= 18) {
            System.out.println(name + " is driving " + car.getModel() + ".");
            car.start();
        } else {
            System.out.println(name + " is not old enough to drive a car.");
        }
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
