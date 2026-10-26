class Solution {
    public int subarraySum(int[] nums, int k) {
       Map<Long, Long> prefixCount = new HashMap<>();
        prefixCount.put(0L, 1L);
 
        long prefixSum = 0;
        long count = 0;
 
        for (int value : nums) {
            prefixSum += value;
 
            long neededSum = prefixSum - k;
            if (prefixCount.containsKey(neededSum)) {
                count += prefixCount.get(neededSum);
            }
            prefixCount.put(
                prefixSum,
                prefixCount.getOrDefault(prefixSum, 0L) + 1
            );
        }
 
        return (int)count;
    }
}