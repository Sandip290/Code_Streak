import java.util.Scanner;

public class SearchIn2D_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int target = sc.nextInt();
        int[][] matrix = new int[m][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[n][m] = sc.nextInt();
            }
        }
        searchMatrix(matrix, target);
    }

    public static boolean searchMatrix(int[][]matrix, int target){
        int row = 0;
        int col = matrix[0].length-1;
        while( row < matrix.length && col >= 0){
            if(matrix[row][col] == target){
                return true;
            }
            else if(matrix[row][col] < target){
                row++;
            }
            else{
                col--;
            }
        }
        return false;
    }
}
