class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        int i =1;
        int j =1;
        while(i<nums.length ){
            if(nums[i] != nums[j-1]){
                nums[j]= nums[i];
                j++;
            }
            i++;
        }
        return j;
    }
}