package kr.ac.sungkyul.paint.i;

import kr.ac.sungkyul.paint.point.ColorPoint;
import kr.ac.sungkyul.paint.point.Point;
import kr.ac.sungkyul.paint.shape.Circle;
import kr.ac.sungkyul.paint.shape.Shape;

public class InstanceOfTest {
	public static void main(String[] args) {
		Shape s = new Circle();		
		System.out.println( s instanceof Circle );
		System.out.println( s instanceof Shape );
		System.out.println( s instanceof Drawable );
		
		Point p = new ColorPoint( 50, 100, "yellow" );
		System.out.println(p instanceof ColorPoint );
		System.out.println(p instanceof Point );
		System.out.println(p instanceof Drawable );
		
	}
}
