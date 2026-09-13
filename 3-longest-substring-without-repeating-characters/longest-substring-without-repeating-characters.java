class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int maxLength = 0;
        int left = 0;
        for(int right =0 ; right < s.length(); right++){
            char ch = s.charAt(right);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
            while(map.get(ch) > 1){
                char leftCh = s.charAt(left);
                map.put(leftCh, map.get(leftCh) - 1);
                left++;
            }
            maxLength = Math.max(maxLength , right - left+1);
        }
        return maxLength;
    }
}