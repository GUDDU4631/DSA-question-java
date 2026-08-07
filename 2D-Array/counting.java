
public class counting {
    public static int countingFun(int[][] matrix, int key) {
        int count = 0;
        for(int[] row : matrix) {
            for(int num : row) {
                if (num == key) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        // example usage
        int[][] mat =  {{4,7,8},{8,8,7} };
        System.out.println(countingFun(mat, 7));
    }
}
