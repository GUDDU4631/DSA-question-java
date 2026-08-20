

public class transpose {
    public static void tranposeMatrix(int[][] matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print("{"+matrix[j][i]+"}");
            }
            System.out.println();
        }
    }
    public static void main(String agr[]){
        int[][] nums = { {1,4,9},{11,4,3},{2,2,3} };
        tranposeMatrix(nums);
    }
}
