public class recursion {
    public static void main(String agr[]) {
        int key = 5;
        int indx= 0;
        int arr[] ={1,3,5,5,6};
        System.out.println(firstOrc( arr , indx , key));
    }

    public static int lastOrc(int arr[])

    public static int firstOrc(int arr[],int indx, int key){
        if(indx == arr.length) return -1;
        if(arr[indx] == key) return indx;
        return firstOrc(arr, indx +1 , key);
    }
    public static int fibonnaci(int n){
        if(n == 0){
            return 0;
        }
        if(n == 1)
            return 1;
        
        int fn = fibonnaci(n-1) + fibonnaci(n-2);
        return fn;
        
    }
    //factorial
    public static int fac(int n){
        if(n == 0){
            return 1;
        }
        return n * fac(n-1);
    }
    //sum of n natural number
    public static int sum(int n){
        if(n == 1){
            return 1;
        }
        return n + sum(n-1);
    }
    //number in increasing order
    public static void rec(int n) {
        if (n == 1) {
            System.out.println(n + "");
            return;
        }
        rec(n - 1);
        System.out.println(n  + "");
    }
}