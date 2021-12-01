class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        int r = 9;
        int c = 9;
        
        // check rows
        for (int i=0; i<r; i++) {
            HashSet<Character> rowSet = new HashSet<>();
            for (int j=0; j<c; j++) {
                if (board[i][j]!='.') {
                    if (rowSet.contains(board[i][j])) {
                        return false;
                    }
                    rowSet.add(board[i][j]);
                }
            }
        }
        
        // check columns
        for (int j=0; j<c; j++) {
            HashSet<Character> colSet = new HashSet<>();
            for (int i=0; i<r; i++) {
                if (board[i][j]!='.') {
                    if (colSet.contains(board[i][j])) {
                        return false;
                    }
                    colSet.add(board[i][j]);
                }
            }
        }
        
    
        for (int rowOffset=0; rowOffset<r; rowOffset+=3) {
            for (int colOffset=0; colOffset<c; colOffset+=3) {
                HashSet<Character> squareSet = new HashSet<>();
                for (int i=rowOffset; i<rowOffset+3; i++) {
                    for (int j=colOffset; j<colOffset+3; j++) {
                        if (board[i][j]!='.') {
                            if (squareSet.contains(board[i][j])) {
                                return false;
                            }
                            squareSet.add(board[i][j]);
                        }
                    }
                }
            }
        }
        
        return true;
    }
}
