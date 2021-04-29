package prob6;

public class RectTriangle extends Shape{

	public RectTriangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public double getArea() {
		return width * height * 0.5;
	}

	@Override
	public double getPerimeter() {
		return width + height + Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
	}

}
