 import java.util.Scanner;

 public class PhamA2Q2 {
	 public static void main(String[] args) {
		   Scanner input = new Scanner(System.in);
		   
		   
		    System.out.println("This program transposes a matrix");
			System.out.println("Please enter the number of rows: ");
			int rows = input.nextInt();
			System.out.println("Please enter the number of columns: ");
			int columns = input.nextInt();
		    int[][] matrix = new int[rows][columns];
		    int[][] transpose = new int[columns][rows];
		   
		   
		   System.out.println("Enter values for [the] " + matrix.length + " rows and "
		   + matrix[0].length + " columns: ");
		   
		   
		   for (int i = 0; i < matrix.length; i++){
		   System.out.println("Row "+i+": ");
		   for (int j = 0; j < matrix[i].length; j++){
		   System.out.print("Column "+j+": ");
		   matrix[i][j] = input.nextInt();
		   }
		   }
		   
		   for (int i = 0; i < rows; i++) {
           for (int j = 0; j < columns; j++) {
           transpose[j][i] = matrix[i][j];
           }
       }
       System.out.println("The matrix looks like this:");
       for (int i = 0; i < rows; i++) {
       for (int j = 0; j < columns; j++) {
      System.out.print(matrix[i][j] + " ");
               }
 System.out.println();
       }
       
       
       System.out.println("The transpose matrix looks like this: ");
       for (int i = 0; i < columns; i++) {
       for (int j = 0; j < rows; j++) {
        System.out.print(transpose[i][j] + " ");
               }
       System.out.println();
       }
}
}
