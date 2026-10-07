class Solution {
    public List<List<String>> solveNQueens(int n) {
       List<List<String>> result = new ArrayList<>();
       List<Integer> temp = new ArrayList<>();
       backtracking(temp, 0,n,result);
        return result;
       
    }
    private void backtracking(List<Integer> temp, int row , int n, List<List<String>> ans){
        if(row == n){
           List<String> board = new ArrayList<>();
            for (int col : temp) {
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < n; j++) {
                    if (j == col) {
                        sb.append('Q');
                    } else {
                        sb.append('.');
                    }
                }
                board.add(sb.toString());
            }
            ans.add(board);
            return;
        }

        for(int col =0; col < n ; col++){
            if(isSafe(row, col,temp)){
                temp.add(col);
                backtracking(temp , row+1,n,ans);
                temp.remove(temp.size() - 1);
            }
        }

    }
    private boolean isSafe(int row , int col , List<Integer> temp){
        for (int r = 0; r < temp.size(); r++) {
            int c = temp.get(r);

            // Same column
            if (c == col) {
                return false;
            }

            // Same diagonal
            if (Math.abs(row - r) == Math.abs(col - c)) {
                return false;
            }
        }

        return true;
    }
}