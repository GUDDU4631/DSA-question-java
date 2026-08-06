public class howManyOne {
    public static int countOne(int n){
        int count =0;
        while(n>0){
            if((n&1)!=0){
                count++;
            }
            n=(n>>1);
        }
        return count;
    }
    public static void main(String agr[]){
        System.out.print(countOne(5));
    }
}
