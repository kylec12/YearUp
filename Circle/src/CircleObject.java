
public class CircleObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Circle bigCircle = new Circle(10);
		double bigCircleArea = bigCircle.CalculateArea();
		System.out.println("big circle's area is" + bigCircleArea);
				bigCircle.PrintColor();
		
		Circle smallCircle = new Circle(5);
		double smallCircleArea = smallCircle.CalculateArea();
	System.out.println("small Circle's area is" + smallCircleArea);
}
}