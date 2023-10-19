
public class Car {

	private String model;
    private double price;
    private boolean isRunning;

    public Car(String model, double price) {
        this.model = model;
        this.price = price;
        this.isRunning = false;
    }

    public void start() {
        if (!isRunning) {
            isRunning = true;
            System.out.println(model + " is now running.");
        } else {
            System.out.println(model + " is already running.");
        }
    }

    public void stop() {
        if (isRunning) {
            isRunning = false;
            System.out.println(model + " has been stopped.");
        } else {
            System.out.println(model + " is already stopped.");
        }
    }

    public void move() {
        if (isRunning) {
            System.out.println(model + " is moving.");
        } else {
            System.out.println(model + " cannot move because it's not running.");
        }
    }

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}


}
