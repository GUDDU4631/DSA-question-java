class Solution {
    public String frequencySort(String s) {
    HashMap<Character, Integer> map = new HashMap<>();

        // Count frequency
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Store unique characters
        List<Character> list = new ArrayList<>(map.keySet());

        // Sort by decreasing frequency
        list.sort((a, b) ->
            Integer.compare(map.get(b), map.get(a))
        );

        // Build answer
        StringBuilder ans = new StringBuilder();

        for (char ch : list) {
            int freq = map.get(ch);

            for (int i = 0; i < freq; i++) {
                ans.append(ch);
            }
        }

        return ans.toString();
    }
}