import java.util.Scanner;

public class SetZeroMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        int col = sc.nextInt();

        int matrix[][] = new int[row][col];
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        setZero(matrix);


        for(int i =0 ; i< row; i++){
            for(int j =0; j <col; j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }

    public static void setZero(int matrix[][]){
        int rowlen = matrix.length;
        int collen = matrix[0].length;

        int[] rowarr = new int[rowlen];
        int[] colarr = new int[collen];

        for(int i = 0; i < rowlen; i++){
            for(int j = 0; j < collen; j++){
                if(matrix[i][j] == 0){
                    rowarr[i] = 1;
                    colarr[j] = 1;
                }
            }
        }

        for(int i = 0; i < rowlen; i++){
            for(int j = 0; j < collen; j++){
                if(rowarr[i] == 1 || colarr[j] == 1){
                    matrix[i][j] = 0;
                }
            }
        }
    }

}
