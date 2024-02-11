import java.util.Scanner;

public class FindThePeak {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] matrix = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        searchMatrix(matrix);
    }

    public static int[] searchMatrix(int[][] mat){
        int n = mat.length;
        int m = mat[0].length;
        int low = 0;
        int high = m-1;
        while(low <= high){
            int mid = (low+high)/2;
            int row = maxElement(mat, m,n,mid);

            int left = mid -1>0 ? mat[row][mid-1]:-1;
            int right = mid+1<m ? mat[row][mid+1]:-1;

            if(mat[row][mid] > left && mat[row][mid] >right){
                return new int[]{row, mid};
            }
            else if(mat[row][mid] < left){
                high = mid-1;
            }
            else{
                low = mid +1;
            }
        }
        return new int[]{-1, -1};
    }

    public static int maxElement(int[][] mat, int n, int m, int col) {
        int maxValue = Integer.MIN_VALUE;
        int index = -1;
        for (int i = 0; i < Math.min(n, mat.length); i++) {
            if (col >= 0 && col < mat[i].length && mat[i][col] > maxValue) {
                maxValue = mat[i][col];
                index = i;
            }
        }
        return index;
    }


}
