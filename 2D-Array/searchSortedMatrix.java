
public class searchSortedMatrix {

    //Binary search
    public static boolean binarySearch(int matrix[][], int key) {

        int m = matrix.length;
        int n = matrix[0].length;

        int low = 0;
        int high = m * n - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            int row = mid / n;
            int col = mid % n;

            if (matrix[row][col] == key) {
                return true;
            } else if (matrix[row][col] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return false;
    }
    //staircase searching 
    public static boolean staircase(int matrix[][],int key){
        int row =0;
        int col = matrix.length-1;
        while(row < matrix.length && col >=0){
            if(matrix[row][col]==key){
                System.out.print("("+row+","+col+")");
                return true;
            } else if(key < matrix[row][col]){
                col--;
            } else{
                row++;
            }
        }
        return false;
    }
    public static void main(String agr[]) {
        int matrix[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };
                int key=15;
                System.out.print(staircase(matrix, key));
    }
}
