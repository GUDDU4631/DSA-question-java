class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low = 0;
        int high = 0;

        for (int w : weights) {
            low = Math.max(low, w);
            high += w;
        }

        while (low <= high) {
            int mid = (low + high) / 2;

            if (possible(weights, mid) <= days) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    private int possible(int[] nums, int cap){
        int day =1;
        int load = 0;
        for(int i =0;i<nums.length;i++){
            if(nums[i] + load > cap){
                load = nums[i];
                day++;
            } else{
                load += nums[i];
            }
        }
        return day;
    }
}