class Solution {
  private int firstOccrence(int[] nums, int x, int n) {
    int low = 0;
    int high = n - 1;
    int result = -1;
    while (low <= high) {
      int mid = low + (high - low) / 2;
      if (nums[mid] == x) {
        result = mid;
        high = mid - 1;
      } else if(nums[mid] > x){
        high = mid - 1;
      }
      else {
        low = mid + 1;
      }
    }
    return result;
  }

  private int lastOccrence(int[] nums, int x, int n) {
    int low = 0;
    int high = n - 1;
    int result = -1;
    while (low <= high) {
      int mid = low + (high - low) / 2;
      if (nums[mid] == x) {
        result = mid;
        low = mid + 1;
      } else if(nums[mid] > x){
        high = mid -1;
      } else {
        low = mid +1;
      }
    }
    return result;
  }

  public int[] searchRange(int[] nums, int target) {
    int firstIdx = firstOccrence(nums, target, nums.length);
    if (firstIdx == -1) return new int[] {-1, -1};
    return new int[] {firstIdx, lastOccrence(nums, target, nums.length)};
  }
}
