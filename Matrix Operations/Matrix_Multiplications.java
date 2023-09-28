import java.util.Scanner;

public class Matrix_Multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows in first matrix : ");
        int firstRows = sc.nextInt();

        System.out.println("Enter the number of columns in first/rows in second matrix : ");
        int colsFirstRowsSecond = sc.nextInt();

        System.out.println("Enter the number of columns in second matrix : ");
        int secondCols = sc.nextInt();

        int[][] matrixA = new int[firstRows][colsFirstRowsSecond];
        int[][] matrixB = new int[colsFirstRowsSecond][secondCols];
        int[][] productAB = new int[firstRows][secondCols];

        System.out.println("Enter elements of first matrix : ");

        for(int i = 0; i < firstRows; i++){
            for(int j = 0; j < secondCols; j++){
                matrixA[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter elements of second matrix : ");

        for(int i = 0; i < firstRows; i++){
            for(int j = 0; j < secondCols; j++){
                matrixB[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < firstRows; i++){
            for(int j = 0; j < secondCols; j++){
                for(int k = 0; k < colsFirstRowsSecond; k++){
                    productAB[i][j] += matrixA[i][k] * matrixB[k][j];
                }   
            }
        }

        System.out.println("The product matrix is : ");

        for(int i = 0; i < firstRows; i++){
            for(int j = 0; j < secondCols; j++){
                System.out.print(productAB[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

