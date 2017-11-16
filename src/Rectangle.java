
public class Rectangle extends Shape {
	private Point firstPoint;
	private Point secondPoint;
	
	public Rectangle() {
		super();
	}

	public Rectangle(Point firstPoint, Point secondPoint) {
		super();
		this.firstPoint = firstPoint;
		this.secondPoint = secondPoint;
	}

	public Point getFirstPoint() {
		return firstPoint;
	}

	public void setFirstPoint(Point firstPoint) {
		this.firstPoint = firstPoint;
	}

	public Point getSecondPoint() {
		return secondPoint;
	}

	public void setSecondPoint(Point secondPoint) {
		this.secondPoint = secondPoint;
	}

	@Override
	public double areaCaculation() {
		//Calculate the sides
		double firstSide = Math.abs(firstPoint.getxCoordinate() - secondPoint.getxCoordinate());
		double secondSide = Math.abs(firstPoint.getyCoordinate() - secondPoint.getyCoordinate());
		return firstSide*secondSide;
	}

}
