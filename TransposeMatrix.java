import com.sun.security.jgss.GSSUtil;

import java.util.*;
public class TransposeMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];

        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
         rotateMatrix(matrix);

        for(int i=0; i< matrix.length; i++){
            for(int j =0; j< matrix.length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void rotateMatrix(int[][] matrix){
        for(int i = 0; i< matrix.length; i++){
            for(int j = 0; j<matrix[0].length; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for(int i =0; i<matrix.length; i++){
            for(int j =0; j<matrix.length/2; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length - 1 - j];
                matrix[i][matrix.length - 1 - j] = temp;
            }
        }
    }
}
