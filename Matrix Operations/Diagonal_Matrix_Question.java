import java.util.Scanner;
public class Diagonal_Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        int row = sc.nextInt();

        System.out.println("Enter the number of colums : ");
        int columns = sc.nextInt();

        // int[][] diagonalMatrix = new int[row][columns];
        int sum1 = 0;
        int sum2 = 0;

        if(row == columns){
            int[][] matrix = new int[row][columns];

            System.out.println("Enter the data of the matrix : ");
            for(int i = 0; i < row; i++){
                for(int j = 0; j < columns; j++){
                    matrix[i][j] = sc.nextInt();
                }
            }

            for(int i = 0; i < row; i++){
                for(int j = 0; j < columns; j++){ 
                    if(i == j){
                        sum1 += matrix[i][j];
                    }
                    if(i + j == row - 1){
                        sum2 += matrix[i][j];
                    }
                }
            }
        }
        else{
            System.out.println("Not a square matrix!!");
        } 
        System.out.println("The absolute difference between the sum of diagonals is : ");
        int diff = sum1 - sum2;
        System.out.println(Math.abs(diff));       
    }
}
