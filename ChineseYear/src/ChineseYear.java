
public class ChineseYear 
{	
	EvaluateChineseYear
	{
		  public static void main(String[] args){
			  
		  int unknownYear;
		int s_knownYear = 1900;
		int yearDifference =  unknownYear - s_knownYear;
		int remainder = yearDifference % 12;
		
			
		
		switch (unknownYear)
		{
		 
		case 0:
			System.out.println(unknownYear + "is the year of rat");
			break;
		case 1:
			System.out.println(unknownYear + "is the year of ox");
			break;
		case 2:
			System.out.println(unknownYear + "is the year of tiger");
			break;
		case 3:
			System.out.println(unknownYear + "is the year of rabbit");
			break;
		case 4:
			System.out.println(unknownYear + "is the year of dragon ");
			break;
		case 5:
			System.out.println(unknownYear + "is the year of snake");
			break;
		case 6:
			System.out.println(unknownYear + "is the year of horse");
			break;
		case 7:
			System.out.println(unknownYear + "is the year of sheep");
			break;
		case 8:
			System.out.println(unknownYear + "is the year of monkey");
			break;
		case 9:
			System.out.println(unknownYear + "is the year of rooster");
			break;
		case 10:
			System.out.println(unknownYear + "is the year of dog");
			break;
		case 11:
			System.out.println(unknownYear + "is the year of pig");
			break;
		}
		
		
		
	
		
		  }	
	}


