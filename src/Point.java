
public class Point {
	private double xCoordinate;
	private double yCoordinate;
	
	public Point() {
		super();
		xCoordinate = 0;
		yCoordinate = 0;
	}

	public Point(double xCoordinate, double yCoordinate) {
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
	 * @param point
	 * @param line
	 * @return distance from a point to a line
	 */
	public static double distance(Point point, StraightLine line) {
		return Math.abs((line.getCoefficient_a() * point.getxCoordinate()
				+ line.getCoefficient_b() * point.getyCoordinate()
				+ line.getCoefficient_c())
				/ Math.sqrt(line.getCoefficient_a() * line.getCoefficient_a()
						+ line.getCoefficient_b() * line.getCoefficient_b()));
	}
	
	public static double segmentLength(Point firstPoint, Point secondPoint) {
		return (Math.sqrt((firstPoint.getxCoordinate() - secondPoint.getxCoordinate()) * (firstPoint.getxCoordinate() - secondPoint.getxCoordinate())
				+ (firstPoint.getyCoordinate() - secondPoint.getyCoordinate()) * (firstPoint.getyCoordinate() - secondPoint.getyCoordinate())));
	}
}