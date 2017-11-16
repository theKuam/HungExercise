
public class Vector {
	private double xCoordinate;
	private double yCoordinate;
	
	public Vector() {
		super();
		xCoordinate = 0;
		yCoordinate = 0;
	}
	public Vector(double xCoordinate, double yCoordinate) {
		super();
		this.xCoordinate = xCoordinate;
		this.yCoordinate = yCoordinate;
	}
	public double getxCoordinate() {
		return xCoordinate;
	}
	public void setxCoordinate(double xCoordinate) {
		this.xCoordinate = xCoordinate;
	}
	public double getyCoordinate() {
		return yCoordinate;
	}
	public void setyCoordinate(double yCoordinate) {
		this.yCoordinate = yCoordinate;
	}
	/**
	 * @param firstPoint
	 * @param secondPoint
	 * @return a Vector
	 */
	public static Vector vectorFormation(Point firstPoint, Point secondPoint) {
		if(firstPoint == null || secondPoint == null) {
			return null;
		}
		double xCoor = firstPoint.getxCoordinate() - secondPoint.getyCoordinate();
		double yCoor = firstPoint.getyCoordinate() - secondPoint.getyCoordinate();
		return new Vector(xCoor, yCoor);
	}
}
