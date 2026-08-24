class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] s1Count = new int[26];
        int[] windowCount = new int[26];
        if (s1.length() > s2.length())
            return false;
        for (char c : s1.toCharArray()) {
            s1Count[c - 'a']++;
        }
        int windowSize = s1.length();
        //first window count 
        for (int i = 0; i < windowSize; i++) {
            windowCount[s2.charAt(i) - 'a']++;
        }
        if (Arrays.equals(s1Count, windowCount)) 
            return true;
        
        //rest of window for s2 string 
        for (int i = windowSize; i < s2.length(); i++) {
            windowCount[s2.charAt(i) - 'a']++;
            windowCount[s2.charAt(i - windowSize) - 'a']--;
            if (Arrays.equals(s1Count, windowCount))
                return true;
        }
        return false;
    }
}