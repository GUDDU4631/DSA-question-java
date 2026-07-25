// import java.util.*;

// public  class loop {
//     public static void main(String agr[]){
//         int i =0 ;
//         while ( i<10){
//             System.out.println(i);
//             i++;
//         }
//     }
// }

//-------------- square shape-----------
// public  class loop {
//     public static void main(String agr[]){
//         for(int i = 0; i<6 ; i++){
//             for(int j =0 ; j<6;j++){
//                 System.out.print(" * ");
//             }
//             System.out.print("\n");
//         }
//     }
// }

//------------ reverse the Number -----------
// public  class loop {
//     public static void main(String agr[]){
//         int n = 1099;
//         int r =0;
//         while(n>0 ){
//             r = n%10;
//            System.out.print(r);
//             n = n/10;
//         }

//     }
// }

// -------------  do while loop ------------

public class loop {
    public static void main(String agr[]) {
        int n = 10;
        boolean isPrime = true;
        if (n == 2) {
            System.out.println("this is prime number");
        } else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    isPrime = false;
                }
            }
            if (isPrime == true) {
                System.out.println("this is prime number");
            } else {
                System.out.println("this is not a prime number");
            }
        }

    }
}