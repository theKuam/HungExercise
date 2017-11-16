
public class Factory {
	public static boolean checkRectangleIn(Point point, Rectangle rectangle) {
		if(point == null || rectangle == null) {
			return false;
		}
		//first find symmetric axises of this rectangle
		StraightLine firstSymmetricAsis = new StraightLine();
		StraightLine secondSymmetricAsis = new StraightLine();
		//find middle point of sides of rectangle
		Point firstMiddle = new Point((rectangle.getFirstPoint().getxCoordinate() + rectangle.getFirstPoint().getxCoordinate()) / 2,
				(rectangle.getFirstPoint().getyCoordinate() + rectangle.getSecondPoint().getyCoordinate()) / 2);
		Point secondMiddle = new Point((rectangle.getFirstPoint().getxCoordinate() + rectangle.getSecondPoint().getxCoordinate()) / 2,
				(rectangle.getFirstPoint().getyCoordinate() + rectangle.getFirstPoint().getyCoordinate()) / 2);
		Point center = new Point((rectangle.getFirstPoint().getxCoordinate() + rectangle.getSecondPoint().getxCoordinate()) / 2,
				(rectangle.getFirstPoint().getyCoordinate() + rectangle.getSecondPoint().getyCoordinate()) / 2);
		//now create symmetric axises
		firstSymmetricAsis = StraightLine.straightLineFormation(firstMiddle, center);
		secondSymmetricAsis = StraightLine.straightLineFormation(secondMiddle, center);
		//check if this point is inside of the rectangle by distance from this point to co-symmetric axis
		if(Point.distance(point, firstSymmetricAsis) - Point.distance(rectangle.getFirstPoint(), firstSymmetricAsis) > 0
				&& (Point.distance(point, secondSymmetricAsis) - Point.distance(rectangle.getFirstPoint(), secondSymmetricAsis) > 0)) {
			return false;
		}
		return true;
	}
	
	public static boolean checkCircleIn(Point point, Circle circle) {
		if(point == null || circle == null) {
			return false;
		}
		//check if this point is inside of the circle by distance from this point to the center
		if(Point.segmentLength(point, circle.getCenter()) > 0) {
			return false;
		}
		return true;
	}
}
