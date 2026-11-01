class Solution {
    public boolean search(int[] nums, int target) {
        return binarySearch(nums, 0, nums.length-1,target);
    }

    private boolean binarySearch(int[] nums, int low, int high, int k) {
    while (low <= high) {
      int mid = low + (high - low) / 2;
      if (nums[mid] == k) return true;
      if (nums[low] == nums[mid] && nums[mid] == nums[high] ) {
        low++;
        high--;
        return binarySearch(nums, low, high, k);
      } else {
        if (nums[low] <= nums[mid]) {
          if (nums[low] <= k && k < nums[mid]) {
            return binarySearch(nums, low, mid, k);
          } else {
            return binarySearch(nums, mid + 1, high, k);
          }
        } else {
          if (nums[mid] < k && k <= nums[high]) {
            return binarySearch(nums, mid + 1, high, k);
          } else {
            return binarySearch(nums, low, mid, k);
          }
        }
      }
    }
    return false;
  }
}