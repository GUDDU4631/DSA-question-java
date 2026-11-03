class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int low = 1; 
        int high = maxElement(nums);
        

        while (low <= high) {
            int mid = (low + high) / 2;
            if(thresholdSum(nums,mid) <= threshold){
                high = mid -1;
            } else{
                low = mid +1;
            }
        }
        return low;
    }
    private int thresholdSum(int[] nums, int diviser){
        double sum = 0;
        for(int i =0;i<nums.length;i++){
            sum += Math.ceil((double)nums[i]/(double)diviser);
        }
        return (int)sum;
    }

    private int maxElement(int[] nums){
        int max = 0;
        for(int val : nums){
            max= Math.max(max, val);
        }
        return max;
    }
}