import java.util.Scanner;

public class Matrix_Transpose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        int rows = sc.nextInt();

        System.out.println("Enter the number of columns : ");
        int columns = sc.nextInt();

        int[][] matrix = new int[rows][columns];
        int[][] transpose = new int[columns][rows];

        System.out.println("Enter the elements of the matrix : ");
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("The transpose of the matrix is : ");
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                transpose[j][i] = matrix[i][j];
            }
        }

        for(int i = 0; i < columns; i++){
            for(int j = 0; j < rows; j++){
                System.out.print(transpose[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

