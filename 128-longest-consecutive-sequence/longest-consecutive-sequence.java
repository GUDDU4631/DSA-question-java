class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> values = new HashSet<>();
        for (int value : nums) {
            values.add(value);
        }
        int longest = 0;
        for(int value : values){
            if(values.contains(value-1)) continue;
            int cnt = 1;
            int nextValue = value + 1;
            while(values.contains(nextValue)){
                nextValue++;
                cnt++;
            }
            longest = Math.max(longest, cnt);
        }
        return longest;
    }
}