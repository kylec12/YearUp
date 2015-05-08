import java.util.Scanner;
public class PhamA3Q1 {

public static boolean isPalindrome(char array1 [], char array2[]) {
	boolean isPalindrome=true;
	for (int x = 0; x < array1.length; x++)
	{
	if (array1[x] != array2[x])
	{
	isPalindrome = false;
	break;
	}
	}
	return isPalindrome;
}
		
public static void main(String[] args) {
Scanner input = new Scanner(System.in);        
System.out.print("Please enter a string: ");
String s1 = input.nextLine();

int count = 0;

char [] array1= s1.toCharArray();
char [] array2 = new char[array1.length] ;


for (int x = array1.length -1; x>=0; x--)
{
	array2[count] = array1[x];
	count ++;
}


String str2 = new String(array2);


System.out.println("Printing array 2 which is reverse of array 1");
for (int x = 0; x < array1.length; x++)
{System.out.print(array2[x]+ " ");
}
System.out.println("");
System.out.println("The string entered is a palindrome: " + isPalindrome(array1, array2));
System.out.println("The new string which has the original string and reversed string concatenated is: "+s1+str2);
}
}