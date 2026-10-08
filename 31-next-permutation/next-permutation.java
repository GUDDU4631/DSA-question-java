class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length-2;
        int idx =-1;
        for(int i =n ;i >=0 ;i--){
            if(nums[i] < nums[i+1]){
                idx = i;
                break;
            }
        }
        if(idx == -1){
            reverse(nums, 0 , nums.length-1);
            return;
        }
        for(int i= nums.length-1;i>idx; i--){
            if(nums[i] > nums[idx]){
                int temp = nums[idx];
                nums[idx] = nums[i];
                nums[i] = temp;
                break;
            }
        }
        reverse(nums, idx+1, nums.length-1);
    }
    private int[] reverse(int[] arr, int start, int end){
        
        while( start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        
        return arr;
    }
}