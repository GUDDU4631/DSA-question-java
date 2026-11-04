class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = maxElement(piles);
        int ans = 0;
        while (low <= high) {
            int mid = (low + high) / 2;
            int takenHour = totalHour(piles, mid);

            if (takenHour <= h) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    private int totalHour(int[] piles, int qun) {
        double totalHr = 0;
        for (int banana : piles) {
            totalHr += Math.ceil((double) banana / (double) qun);
        }
        return (int) totalHr;
    }

    private int maxElement(int[] nums) {
        int maxElement = 0;
        for (int ele : nums) {
            maxElement = Math.max(maxElement, ele);
        }
        return maxElement;
    }
}