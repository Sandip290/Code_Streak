public class SetZeroRowCol {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        boolean[] rowzero = new boolean[m];
        boolean[] colzero = new boolean[n];

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(matrix[i][j]==0){
                    rowzero[i] = true;
                    colzero[j] = true;
                }
            }
        }

        for(int i =0;i<n; i++){
            for(int j=0; j<m; j++){
                if( rowzero[i] || colzero[j]){
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
