public class stringBuilderC{
    public static void main(String agr[]){
        StringBuilder sb = new StringBuilder("");
        for( char c='a';c<='z';c++){
            sb.append(c);
        }
        System.out.print(sb);
    }
}