class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int low = minimumEle(bloomDay);
        int high = maximumEle(bloomDay);

        int ans = -1;
        while(low <= high){
            int mid =(low + high)/2;
            if(possible(bloomDay,mid,m,k)){
                ans = mid;
                high = mid -1;
            } else{
                low = mid +1;
            }
        }
        return ans;
        
    }

    private boolean possible(int[] nums, int day, int m, int k){
        int noOfb =0;
        int cnt =0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]<= day){
                cnt++;
            } else{
                noOfb += (cnt/k);
                cnt = 0;
            }
        }
        noOfb += (cnt /k);
        cnt = 0;
        return noOfb >= m;
    }
    private int minimumEle(int[] nums){
        int result =Integer.MAX_VALUE;
        for(int el : nums){
            result = Math.min(result, el);
        }
        return result;
    }
    private int maximumEle(int[] nums){
        int result =Integer.MIN_VALUE;
        for(int el : nums){
            result = Math.max(result, el);
        }
        return result;
    }
}