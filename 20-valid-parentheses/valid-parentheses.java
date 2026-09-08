class Solution {
    public boolean isValid(String s) {
        Stack<Character> result = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                result.push(c);
            }
            else {
                if (result.isEmpty()) {
                    return false;
                }
                char top = result.pop();
                if (c == ')' && top != '(' ||
                        c == '}' && top != '{' ||
                        c == ']' && top != '[') {
                    return false;
                }
            }
        }
        return result.isEmpty();
    }
}