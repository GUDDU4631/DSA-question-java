public class shortColor75 {
    public void sortColors(int[] nums) {
       int largestNum = Integer.MIN_VALUE;
       //get largestNum...
       for(int i=0;i<nums.length;i++){
        if(largestNum<nums[i]){
            largestNum=nums[i];
        }
       }
        //counting the valuse how many time appear 
        int[] counting = new int[largestNum+1];
        for(int i=0;i<nums.length;i++){
            counting[nums[i]]++;
        }
        int j =0;
        for(int i=0;i<counting.length;i++){
            while(counting[i]>0){
                nums[j]= i;
                j++;
                counting[i]--;
            }
        }
    }
}
