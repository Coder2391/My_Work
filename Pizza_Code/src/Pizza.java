
public class Pizza {
	
	private String size;
	private int cheese_tops;
	private int pepperoni_tops;
	private int hamp_tops;
	private int Pizza_cost;
	private int Top_cost;
	
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public int getCheese_tops() {
		return cheese_tops;
	}
	public void setCheese_tops(int cheese_tops) {
		this.cheese_tops = cheese_tops;
	}
	public int getPepperoni_tops() {
		return pepperoni_tops;
	}
	public void setPepperoni_tops(int pepperoni_tops) {
		this.pepperoni_tops = pepperoni_tops;
	}
	public int getHamp_tops() {
		return hamp_tops;
	}
	public void setHamp_tops(int hamp_tops) {
		this.hamp_tops = hamp_tops;
	}
	
	public int getPizza_cost() {
		return Pizza_cost;
	}
	public void setPizza_cost(int pizza_cost) {
		Pizza_cost = pizza_cost;
	}
			
	public int getTop_cost() {
		return Top_cost;
	}
	public void setTop_cost(int top_cost) {
		Top_cost = top_cost;
	}
	
	@Override
	public String toString() {
		return "Pizza [size=" + size + ", cheese_tops=" + cheese_tops + ", pepperoni_tops=" + pepperoni_tops
				+ ", hamp_tops=" + hamp_tops + ", Pizza_cost=" + Pizza_cost + "]";
	}
	
	public double calcCost() {
		return Pizza_cost + Top_cost;
	}
	
	public String getDescription() {
		return toString();
	}
	
}
