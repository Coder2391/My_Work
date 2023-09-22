
public class PizzaOrder {
	private Pizza[] pizzas;
    private int numberOfPizzas;

    public PizzaOrder() {
        pizzas = new Pizza[3]; // Allows up to three pizzas in an order
        numberOfPizzas = 0;
    }

    public void addPizza(Pizza pizza) {
        if (numberOfPizzas < 3) {
            pizzas[numberOfPizzas] = pizza;
            numberOfPizzas++;
        } else {
            System.out.println("Maximum number of pizzas in the order reached.");
        }
    }

    public double calcTotal() {
        double totalCost = 0.0;
        for (int i = 0; i < numberOfPizzas; i++) {
            totalCost += pizzas[i].calcCost();
        }
        return totalCost;
    }
}

