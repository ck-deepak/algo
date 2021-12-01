class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int[][] result = new int[r][c];
        
        // error check boundary case
        if (mat.length == 0 || r * c != mat.length * mat[0].length)
            return mat;
        
        int r1 = mat.length; // row len
        int c1 = mat[0].length; // col len
        
        int count = 0;
        for (int i=0; i<r1;i++) {
            for (int j=0; j<c1; j++) {
                int row = count/c;
                int col = count%c;
                result[row][col] = mat[i][j];
                count++;
            }
        }
        return result;
    }
}
