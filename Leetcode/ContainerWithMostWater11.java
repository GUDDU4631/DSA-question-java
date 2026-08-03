public class ContainerWithMostWater11 {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int trap = 0;
        while (left <= right) {
            int waterLevel = Math.min(height[left], height[right]);
            int water = (right - left) * waterLevel;
            trap = Math.max(water,trap);
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return trap;
    }
}
