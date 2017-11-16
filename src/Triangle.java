
public class Triangle extends Shape {
	private double height;
	private double base;
	
	public Triangle() {
		super();
	}

	public Triangle(double height, double base) {
		super();
		this.height = height;
		this.base = base;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	@Override
	public double areaCaculation() {
		return height * base / 2;
	}

}
