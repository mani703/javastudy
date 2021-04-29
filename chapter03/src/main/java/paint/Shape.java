package paint;

public abstract class Shape {	// 추상적인 클래스 new를 하지 않기 위해
	private String lineColor;
	private String fillColor;
	
	public abstract void draw();
}
