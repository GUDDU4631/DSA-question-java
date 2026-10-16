class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for (int row = 1; row <= numRows; row++) {
            ans.add(generateRow(row));
        }
        return ans;
    }

    private List<Integer> generateRow(int row) {
        List<Integer> ansList = new ArrayList<>();
        int ans = 1;
        ansList.add(ans);
        for (int col = 1; col < row; col++) {
            ans = ans * (row - col);
            ans = ans / col;

            ansList.add(ans);
        }
        return ansList;
    }
}