import java.util.*;

public class FindtheDuplicateNumber287 {
    // using hash set the time and space complexity will O(n);
    public int findDuplicate1(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return nums[i];
            }
            set.add(nums[i]);
        }
        return 0;
    }

    // Floyd's Cycle Detection
        public int findDuplicate2(int[] nums) {
            int slow = nums[0];
            int fast = nums[0];
            // Find the meeting point
            do {
                slow = nums[slow];
                fast = nums[nums[fast]];
            } while (slow != fast);
            // Find the entrance of the cycle
            slow = nums[0];
            while (slow != fast) {
                slow = nums[slow];
                fast = nums[fast];
            }

            return slow;
        }
    }