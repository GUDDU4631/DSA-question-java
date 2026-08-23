class Solution {
    public String removeOccurrences(String s, String part) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            stack.push(s.charAt(i));
            if (stack.size() >= part.length()) {
                StringBuffer topString = new StringBuffer();
                int start = stack.size() - part.length();
                for (int j = start; j < stack.size(); j++) {
                    topString.append(stack.get(j));
                }
                if (topString.toString().equals(part)) {
                    for(int j=0;j<part.length();j++){
                        stack.pop();
                    }
                }
            }
        }
        StringBuffer result = new StringBuffer();
        for (char c : stack) {
            result.append(c);
        }
        return result.toString();
    }
}