
public class Circle extends Shape {
	private Point center;
	private double radius;
	public Circle() {
		super();
	}
	public Circle(Point center, double radius) {
		super();
		this.center = center;
		this.radius = radius;
	}
	public Point getCenter() {
		return center;
	}
	public void setCenter(Point center) {
		this.center = center;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(float radius) {
		this.radius = radius;
	}
	@Override
	public double areaCaculation() {
		return radius * radius * Math.PI;
	}
}
