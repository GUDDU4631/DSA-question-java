class Solution {
    public int mySqrt(int x) {
        long low = 1;
        long high = x;
        long ans = 1;
        if (x == 0)
            return x;
        while (low <= high) {
            long mid = low + (high - low)/2;
            long val = mid * mid;
            if (val <= x) {
                ans = Math.max(ans, mid);
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return (int) ans;
    }
}