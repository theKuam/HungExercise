
/**
 * base on linear equation: ax + by + c = 0
 *
 */
public class StraightLine {
	private double coefficient_a;
	private double coefficient_b;
	private double coefficient_c;
	
	public StraightLine() {
		super();
		coefficient_a = 0;
		coefficient_b = 0;
		coefficient_c = 0;
	}

	public StraightLine(double coefficient_a, double coefficient_b, double coefficient_c) {
		super();
		this.coefficient_a = coefficient_a;
		this.coefficient_b = coefficient_b;
		this.coefficient_c = coefficient_c;
	}

	public double getCoefficient_a() {
		return coefficient_a;
	}

	public void setCoefficient_a(double coefficient_a) {
		this.coefficient_a = coefficient_a;
	}

	public double getCoefficient_b() {
		return coefficient_b;
	}

	public void setCoefficient_b(double coefficient_b) {
		this.coefficient_b = coefficient_b;
	}

	public double getCoefficient_c() {
		return coefficient_c;
	}

	public void setCoefficient_c(double coefficient_c) {
		this.coefficient_c = coefficient_c;
	}

	/**
	 * @param vector (its normal vector, not direction vector)
	 * @param point
	 * @return a straight line
	 */
	public static StraightLine straightLineFormation(Vector vector, Point point) {
		if(vector == null || point == null) {
			return null;
		}
		
		double aCoef = vector.getxCoordinate();
		double bCoef = vector.getyCoordinate();
		double x0 = aCoef*point.getxCoordinate();
		double y0 = bCoef*point.getyCoordinate();
		double cCoef = - x0 - y0;
		
		return new StraightLine(aCoef, bCoef, cCoef);
	}
	
	public static StraightLine straightLineFormation(Point firstPoint, Point secondPoint) {
		if(firstPoint == null || secondPoint == null) {
			return null;
		}
		if(firstPoint.getxCoordinate() - secondPoint.getxCoordinate() == 0) {
			return new StraightLine(1, 0, - firstPoint.getxCoordinate());
		}
		if(firstPoint.getyCoordinate() - secondPoint.getyCoordinate() == 0) {
			return new StraightLine(0, 1, - firstPoint.getyCoordinate());
		}
		double aCoef = (firstPoint.getyCoordinate() - secondPoint.getyCoordinate()) / (firstPoint.getxCoordinate() - secondPoint.getxCoordinate());
		double bCoef = 1;
		double x0 = - aCoef*firstPoint.getxCoordinate();
		double y0 = bCoef*firstPoint.getxCoordinate();
		double cCoef = x0 + y0;
		
		return new StraightLine(aCoef, bCoef, cCoef);
	}
}
