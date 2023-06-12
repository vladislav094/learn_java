package practices;

class Helper{
    public static final int[][] makeLatinSquare(int n) {
        int[][] latinSquare = new int[n][n];
        for(int i = 0;  i < latinSquare.length; i++){
            for(int j = 0; j < latinSquare[i].length; j++) {
                latinSquare[i][j] = ((i + 1) + j) % n;
                if (latinSquare[i][j] == 0) latinSquare[i][j] = n;
            }
        }
        return latinSquare;
    }
}


public class LatinSquares {
    public static void main(String[] args) {
        int[][] result;
        result = Helper.makeLatinSquare(4);
        for(int[] x: result){
            for(int z: x){
                System.out.print(z + " ");
            }
            System.out.println();
        }
    }
}
