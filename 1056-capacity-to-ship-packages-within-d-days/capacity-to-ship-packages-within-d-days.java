class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low = maxEle(weights);
        int high = sum(weights);
        int ans =0;

        while(low <= high){
            int mid = (low  + high)/2;

            if(possible(weights,mid) <= days){
                high = mid - 1;
                ans = mid;
            } else{
                low = mid +1;
            }
        }
        return ans;
    }

    private int possible(int[] weights, int cap){
        int day = 1;
        int load =0;
        for(int i =0;i<weights.length;i++){
            if(weights[i] + load > cap){
                day++;
                load = weights[i];
            } else{
                load += weights[i];
            }
        }
        return day;
    }


    private int maxEle(int[] nums){
        int maxEle = Integer.MIN_VALUE;
        for(int val : nums){
            maxEle = Math.max(maxEle, val);
        }
        return maxEle;
    }


    private int sum(int[] nums){
        int sum = 0;
        for( int val : nums){
            sum += val;
        }
        return sum;
    }
}