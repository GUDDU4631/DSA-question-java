public class countLowerCH{
    public static int count(String str){
        int count =0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == Character.toLowerCase(str.charAt(i))) count++;
        }
        return count;
    }
    public static void main(String agr[]){
        String str  = "Guddu";
        System.out.print(count(str));
    }
}