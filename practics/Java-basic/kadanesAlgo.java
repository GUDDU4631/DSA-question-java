
public class kadanesAlgo {

    public static void sumOfSubarray(int[] arr) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            currSum = currSum + arr[i];
            maxSum = Math.max(currSum, maxSum);
            if (currSum < 0) {
                currSum = 0;
            }
        }
        System.out.print(maxSum);
    }

    public static void main(String agr[]) {
        int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
        sumOfSubarray(arr);
    }
}


/*
    Kadane's law say that for finding the maximum sum of an subarray the current sum is always zero 
    when the current sum = current sum + array[i] become smaller than zero;
 */