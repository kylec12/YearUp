
public class CalculateArea {

	public static void main(String[] args) {
	double circleArea= CalculateCircleArea(4);
	System.out.println("The circle area is : " + circleArea);
	double rectangleArea= CalculateRectangleArea(5,10);
	System.out.println("The rectangle area is : " + rectangleArea);
	}
	// This tells the area of the circle and its half point.
	 static double CalculateCircleArea (int radius)
	 {
		 double area= 3.14* radius* radius;
		 return area;
				 
	 }
	 static double CalculateRectangleArea(int length,int breadth){
		double area= length* breadth;
		return area;
		 
		
	 }
	 
}
	 


