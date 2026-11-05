class Solution {
    public void reverseString(char[] s) {
        System.out.print(recursion(s,0,s.length -1));
    }
    private char[] recursion(char[] s, int low, int high){
        if(low >= high) return s;

        char temp = s[low];
        s[low] = s[high];
        s[high] = temp;
        return recursion(s,low + 1,high - 1);
    }

}