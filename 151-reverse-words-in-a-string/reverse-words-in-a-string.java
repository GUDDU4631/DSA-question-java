class Solution {
    public String reverseWords(String s) {
        StringBuffer result = new StringBuffer();
        for (int i = s.length() - 1; i >= 0; i--) {
            StringBuffer curr = new StringBuffer();
            while (i >= 0 && s.charAt(i) != ' ') {
                curr.append(s.charAt(i));
                i--;
            }
            result.append(curr.reverse());
            if(result.length() >0 && result.charAt(result.length() -1) != ' '){
                result.append(' ');
            }
            

        }
        return  result.toString().trim();
    }
}