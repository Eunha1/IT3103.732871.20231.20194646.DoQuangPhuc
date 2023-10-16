import java.util.Scanner;

public class AddTwoMatrix {
	  public static void inputMatrixElements(Scanner scanner, int[][] matrix) {
	        for (int i = 0; i < matrix.length; i++) {
	            for (int j = 0; j < matrix[0].length; j++) {
	                System.out.print("Enter element at row " + (i + 1) + " column " + (j + 1) + ": ");
	                matrix[i][j] = scanner.nextInt();
	            }
	        }
	    }
	    public static int[][] addMatrices(int[][] matrixA, int[][] matrixB) {
	        int rows = matrixA.length;
	        int columns = matrixA[0].length;
	        int[][] result = new int[rows][columns];
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < columns; j++) {
	                result[i][j] = matrixA[i][j] + matrixB[i][j];
	            }
	        }
	        return result;
	    }
	    public static void displayMatrix(int[][] matrix) {
	        for (int i = 0; i < matrix.length; i++) {
	            for (int j = 0; j < matrix[0].length; j++) {
	                System.out.print(matrix[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();
        int[][] matrixA = new int[rows][columns];
        int[][] matrixB = new int[rows][columns];
        System.out.println("Enter elements for matrix A:");
        inputMatrixElements(scanner, matrixA);
        System.out.println("Enter elements for matrix B:");
        inputMatrixElements(scanner, matrixB);
        int[][] resultMatrix = addMatrices(matrixA, matrixB);
        System.out.println("Resultant Matrix:");
        displayMatrix(resultMatrix);
        scanner.close();
    }
}

