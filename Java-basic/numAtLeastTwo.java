public class numAtLeastTwo{
    public static boolean repeatedNum(int nums[]){
        boolean isRepeat = false;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]==nums[i]){
                    isRepeat= true;
                }
            }
        }
        return isRepeat;
    }
    public static void main(String agr[]){
        int[] nums = {1, 2, 3, 1};
        // int[] nums = {1, 2, 3, 4};
        System.out.print(repeatedNum(nums));
    }
}