class Solution {
    public int splitArray(int[] nums, int k) {
        return subArray(nums, k);
    }

    private int subArray(int[]  nums, int k){
        int low = 0;
        int high = 0;
        for(int i =0;i<nums.length;i++){
            low = Math.max(low,nums[i]);
            high += nums[i];
        }

        while(low <= high){
            int mid = (low + high)/2;
            int totalSum = totalSum(nums,mid);

            if(totalSum > k){
                low = mid +1;
            } else{
                high = mid -1;
            }
        }
        return low;
    }

    private int totalSum(int[] nums, int k){
        int subArray =1;
        int sumOfarray =0;

        for(int i =0;i<nums.length;i++){
            if(sumOfarray + nums[i] <= k){
                sumOfarray += nums[i];
            } else{
                subArray += 1;
                sumOfarray = nums[i];
            }
        }
        return subArray;
    }
}