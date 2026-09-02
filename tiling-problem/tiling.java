public class tiling {
    public static int till(int n){
        if(n == 0 || n ==1) return 1;
        int verticalTile = till(n-1);
        int horizontalTile = till(n-2);
        return verticalTile + horizontalTile ;
    }
    public static void main(String agr[]){
        System.out.println(till(4));
    }
}
