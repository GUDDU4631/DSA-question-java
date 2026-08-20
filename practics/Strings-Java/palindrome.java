public class palindrome{
    public static boolean Ispalindrome(String str){
        boolean isPalindrome = false;
        int i=0;
        int j=str.length()-1;
        while(i<j){
            if(str.charAt(i)==str.charAt(j)){
                isPalindrome=true;
                i++;
                j--;
            }else{
                return false;
            }
        }
        return isPalindrome;
    }
    public static void main(String agr[]){
        String str = "noom";
        System.out.print(Ispalindrome(str));
    }
}