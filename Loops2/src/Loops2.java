
public class Loops2 {
	

	public static void loopFind  (int[] array, int inputValue)
	{
		boolean lostNumber = false;
		for (int i = 0; i < array.length; i++)
		{	
			if (inputValue == array[i])
			{
				lostNumber = true;
				System.out.println("I have found my number in index " + i);

			}
			if (lostNumber == false)
			{
				System.out.println("I have not found the value you're looking for!");
			}
		}
	}

	public static void findLoop (int[] array, int inputValue)
	{
		boolean lostNumber = false;
		int numberOfOccurrences = 0;

		for (int i = 0; i < array.length; i++)
		{
			if (inputValue == array[i])
			{
				lostNumber = true;
				numberOfOccurrences++;
			}
		}
		if (lostNumber == true)
		{
			System.out.println("I found your input value " + numberOfOccurrences + " times.");
		}
		else
		{
			System.out.println("I have not found the value you're looking for!");
		}
	}


	public static void main(String[] args) 
	{
		int [] array1 = {10,-24,33,28,22};
		loopFind(array1, 22);

		int [] array2 = {2,3,3,4,5,3,8,3};
		findLoop(array2, 3);
	}
}



