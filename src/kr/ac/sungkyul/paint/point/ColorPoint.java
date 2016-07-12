package kr.ac.sungkyul.paint.point;

public class ColorPoint extends Point {
	private String color;

	public ColorPoint( int x, int y, String color ) {
		super(x, y);
//		setX( x );
//		setY( y );
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public void show() {
		System.out.println( 
		 "[x=" + getX() + ",y=" + getY() + ",color=" + color + "]에 점을 그렸습니다." );
		
	}

	
}
