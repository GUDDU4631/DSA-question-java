class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int frequ[] = new int[n*n+1];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                frequ[grid[i][j]]++;
            }
        }
        int repeating=-1;
        int missing =-1;
        for(int i=1;i<frequ.length;i++){
            if (frequ[i] == 2) {
                repeating = i;
            }
            if(frequ[i]==0){
                missing=i;
            }
        }
        return new int[]{repeating,missing};
    }
}