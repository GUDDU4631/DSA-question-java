import java.util.*;
public class MajorityElement169 {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int lastMax = 1;
        int currMax = 1;
        int maxElement = 0;
        if (nums.length == 1)
            return nums[0];
        if (nums.length == 0)
            return 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                currMax++;
            } else {
                currMax = 1;
            }

            if (lastMax < currMax) {
                lastMax = currMax;
                maxElement = nums[i];
            }
        }
        return maxElement;

    }

}