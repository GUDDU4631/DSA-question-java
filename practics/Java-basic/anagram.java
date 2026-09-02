public class anagram {
    public static boolean isAnaram(String s1, String s2){
        if(s1.length() != s2.length()) return false;
        int[] freq= new int[25];
        for(int i=0;i<s1.length();i++){
            freq[s1.charAt(i)-'a']++;
        }
        for(int i=0;i<s2.length();i++){
            freq[s2.charAt(i)-'a']--;
        }
        for(int i=0;i<freq.length;i++){
            if(freq[i] != 0) return false;
        }
        return true;
    }
    public static void main(String agr[]){
        String s1="hello";
        String s2 = "olleh";
        System.out.print(isAnaram(s1, s2));
    }
}
