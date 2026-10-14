class Solution {
    public int[] rearrangeArray(int[] nums) {
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] < 0) {
                neg.add(nums[i]);
            } else {
                pos.add(nums[i]);
            }
        }
        if (pos.size() > neg.size()) {
            for (int i = 0; i < neg.size(); i++) {
                nums[2 * i] = pos.get(i);
                nums[2 * i + 1] = neg.get(i);
            }
            int indx = neg.size() * 2;
            for (int i = neg.size(); i < pos.size(); i++) {
                nums[indx] = pos.get(i);
                indx++;
            }
        } else {
            for (int i = 0; i < pos.size(); i++) {
                nums[2 * i] = pos.get(i);
                nums[2 * i + 1] = neg.get(i);
            }
            int indx = pos.size() * 2;
            for (int i = pos.size(); i < neg.size(); i++) {
                nums[indx] = neg.get(i);
                indx++;
            }
        }
        return nums;
    }
}