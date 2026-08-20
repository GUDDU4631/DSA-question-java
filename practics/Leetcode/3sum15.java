import java.util.*;
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
       List<List<Integer>> result =  new    ArrayList <List<Integer>> ();
       int[] prefix = new int[nums.length];
       for(int i =0;i<nums.length;i++){
        for(int j=i+1;j<nums.length;j++){
            for(int k=j+1;k<nums.length;k++){
                //make list for element
                List<Integer> triple = new ArrayList<>();
                if(nums[i]+nums[j]+nums[k]==0){
                    triple.add(nums[i]);
                    triple.add(nums[j]);
                    triple.add(nums[k]);
                    Collections.sort(triple);
                    result.add(triple);
                }
            }
        }
       }
       //set did not allwo to store dublicate element
       result = new ArrayList(new HashSet<>(result));
        return result;
    }
}