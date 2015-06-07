//p1
public class Loops {

	public static int search1( int[] array, int key)
	{
	
	int counter = 0;
		
	for(int i = 0; i < array.length; i++)
	{
		if( array[i] == key){
			counter++;
		}
			
	}	
			
	return counter;
		
	}
	//p2

	public static void NumberOfOccurence(int [] j,int search)
	{
		int NumberOfOccurence = 0;
		
		for (int Number = 0; Number < j.length; Number++  )
		{
		if ( j  [Number] == search)
		{
			NumberOfOccurence++;
		}
		}
	System.out.println ("number of occurrences " +  NumberOfOccurence); 
	}
	


	
	
	
	public static void main (String[] args)
	{
	int[] array = {1,2,3,4,5,6,7,7,7,7};
	NumberOfOccurence(array, 12);
	

		
	}
}
