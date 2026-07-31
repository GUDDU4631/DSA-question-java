public class prefixSum {
    public static void sumOfSubarray(int[] arr){
        int[] prefixSum = new int[arr.length];
        
        for(int i=0; i<arr.length ;i++){
            if(i==0){
                prefixSum[i]=arr[i];
            } else {
                prefixSum[i] =  prefixSum[i-1] + arr[i];
            }
        }
        int maxSum = Integer.MIN_VALUE;
        int currSum;
        for(int i =1 ; i< arr.length;i++){
            for(int j=i;j<arr.length;j++){
                currSum = i== 0 ?  prefixSum[0] : prefixSum[j] - prefixSum[i-1] ;
                if(maxSum < currSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.print(maxSum);
    }
    public static void main(String agr[]){
        int[] arr = {1,-2,6,-1,3};
        sumOfSubarray(arr);
    }
}
/*
 prefix sum : in prefix sum we store the sum of arr element from  0 to i = at prefix[i];
 and for finding sum of any sub array just do prefix[end] - prefix[start - 1];
 */