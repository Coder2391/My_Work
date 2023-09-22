package Shapes;

public class Circle extends Shape{
	public int radius;

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	
	protected double getPerimeter() {
		return 2*(3.14)*radius;

	}
	
	protected double getArea() {
		return (3.14)*radius*radius;

	}

	
}
