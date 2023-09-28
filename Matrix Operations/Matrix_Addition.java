import java.util.Scanner;

public class Matrix_Addition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        int row = sc.nextInt();

        System.out.println("Enter the number of colums : ");
        int columns = sc.nextInt();

        int[][] matrix1 = new int[row][columns];
        int[][] matrix2 = new int[row][columns];
        int[][] sum = new int[row][columns];

        System.out.println("Enter the data of the first matrix : ");
        for(int i = 0; i < row; i++){
            for(int j = 0; j < columns; j++){
                matrix1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the data of the second matrix : ");
        for(int i = 0; i < row; i++){
            for(int j = 0; j < columns; j++){
                matrix2[i][j] = sc.nextInt();
            }
        }

        System.out.println("Sum of the two matrices is : ");
        for(int i = 0; i < row; i++){
            for(int j = 0; j < columns; j++){
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
                System.out.print(sum[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
