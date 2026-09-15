class Solution {
    public int search(int[] nums, int target) {
        return binary(nums, 0, nums.length - 1, target);
    }

    private int binary(int arr[], int si, int ei, int target) {
        if (si > ei)
            return -1;
        int mid = si + (ei - si) / 2;
        if (arr[mid] == target)
            return mid;
        if (arr[si] <= arr[mid]) {
            if (target >= arr[si] && target <= arr[mid]) {
                return binary(arr, si, mid - 1, target);
            } else {
                return binary(arr, mid + 1, ei, target);
            }
        } else {
            if (target <= arr[ei] && target >= arr[mid]) {
                return binary(arr, mid + 1, ei, target);
            } else {
                return binary(arr, si, mid - 1, target);
            }
        }
    }
}