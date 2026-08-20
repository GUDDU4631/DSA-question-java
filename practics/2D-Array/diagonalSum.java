
public class diagonalSum {
    public static int totalSum(int matrix[][]){
        int sum =0;
        for(int i=0;i<matrix.length;i++){
            //Primary diagonal sum
            sum += matrix[i][i];
            //secondary diagonal sum
            if(i != matrix.length-1-i)
                sum += matrix[i][matrix.length-1-i];
        }
        return sum;
    }
    public static void main(String agr[]){
        int matrix[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
             System.out.print(totalSum(matrix));
    }
}
