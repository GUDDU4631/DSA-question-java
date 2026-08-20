class Solution {
    public void setZeroes(int[][] matrix) {
        HashSet<Integer> zeroRows = new HashSet<>();
        HashSet<Integer> zeroCols = new HashSet<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {

                if (matrix[i][j] == 0) {
                    zeroRows.add(i);
                    zeroCols.add(j);
                }
            }
        }
        for (int value : zeroRows) {
            for(int i=0;i<matrix[0].length;i++){
                matrix[value][i]=0;
            }
        }
        for (int value : zeroCols) {
            for(int i=0;i<matrix.length;i++){
                matrix[i][value]=0;
            }
        }
    }
}