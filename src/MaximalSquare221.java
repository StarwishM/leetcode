public class MaximalSquare221 {
    public static void main(String[] args){
        char[][] m = {{'1','0','1','0','0'},{'1','0','1','1','1'},{'1','1','1','1','1'},{'1','0','0','1','0'}};
        System.out.println(maximalSquare(m));
    }

    private static int maximalSquare(char[][] matrix) {
        int maxSquareSide = 0;
        if(matrix == null||matrix.length == 0||matrix[0].length == 0){
            return maxSquareSide;
        }
        int rows = matrix.length,columns=matrix[0].length;
//        System.out.println(m);

        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                if(matrix[i][j]=='0'){
                    int currentMaxSide = Math.min(rows-i,columns-j);
                    for(int k=1;k<currentMaxSide;k++){
                        boolean flag = true;
                        if(matrix[i+k][j+k]=='0'){
                            break;
                        }
                        for(int m=0;m<k;m++) {
                            if (matrix[i + k][j + m]=='0'||matrix[i+m][j+k]=='0'){
                                flag = false;
                                break;
                            }
                        }
                        if(flag) {
                            maxSquareSide = Math.max(maxSquareSide, k + 1);
                        }
                        else{
                            break;
                        }
                    }

                }
                //System.out.println(matrix[i][j]);
            }
        }
        return maxSquareSide*maxSquareSide;
    }
}
