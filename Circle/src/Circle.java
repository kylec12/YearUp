
 class Circle 
 {
	
String m_color = null;
double m_radius = -1;

	 Circle(double radius) 
	{
		m_radius = radius;
		 m_color= "grey";
			
		}
	Circle(double radius, String color)
	{
		m_radius = radius;
		m_color = color;
	}
		double CalculateArea() {
			double area = 3.14 * m_radius * m_radius;
			return area;
			
		}
	 void PrintColor()
	 {
		System.out.println("my color is" + m_color);	
	
	 
 }
 }
	 
	
