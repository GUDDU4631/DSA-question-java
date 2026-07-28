// class function{
//     int sum(int a, int b){
//         return a +b;
//     }

//     public static void main(String agr[]){
//         System.out.println("asdf");
//     }
// }

// ------------------------ Binomial coefficient ----------------------

// public class function{
//     public static int fac(int Num) {
//         int fac = 1;
//         for(int i =1 ; i<= Num; i++){
//             fac = fac * i;
//         }
//         return fac;
//     }
//     public static int binCoeff(int n, int r){
//         int a = fac(n);
//         int b = fac(r);
//         int c = fac(n-r);
//         int Binomial_coefficient = a/(b*c);
//         return Binomial_coefficient;
//     }
//     public static void main(String sgr[]){
//         System.out.print(binCoeff(5,2));
//     }
// }


//--------------------- PRIME NUMBER ----------------------


// public class function {

    // public static boolean isPrime(int num){
    // boolean isPrime = true;
    // for(int i =2; i<num ; i++){
    // if(num%i == 0){
    // isPrime = false;
    // } else {
    // isPrime = true;
    // }
    // }
    // return isPrime;
    // }

    // optimize version 

    // public static boolean isPrime(int num) {
    //     if (num == 2) {
    //         return true;
    //     }
    //     for (int i = 2; i <= Math.sqrt(num); i++) {
    //         if (num % i == 0) {
    //             return false;
    //         }
    //     }
    //     return true;
    // }
    // public static void primeInRange(int num){
//         for(int i=1 ; i<=num;i++){
//             if(isPrime(i) == true){
//                 System.out.println(i);
//             }
//         }
//     }
//     public static void main(String agr[]) {
//         primeInRange(10);
//     }
// }



//-------------------- Binary to Decimal ----------------------


// public class function {
//     public static int binaryToDecimal(int num){
//         
//         int decimalValue = 0;
//         int power = 0;
//         while(num>0){
//            int r = num%10 ;
//             decimalValue += r * (int)Math.pow(2,power);
//             power++;
//             num = num/10;
//         }

//         return decimalValue;
//     }
//     public static void main(String agr[]){
//         System.out.print(binaryToDecimal(101));
//     }
// }


//--------------------- Decimal to binary -----------------


// public class function {
//     public static int decimaltoBinary(int num){
//         int bin=0;
//         int power= 0;
//         while(num > 0){
//            int remender = num%2;
//             bin += remender * (int)Math.pow(10,power);
//             power++;
//             num = num/2;
//         }
//         return bin;
//     }
//     public static void main(String agr[]){
//         System.out.print(decimaltoBinary(5));
//     }
// }


//----------------- palindrome ----------------

// public class function {
//     public static boolean isPalindrome(int num){
//         boolean isPalindrome = false;
//         int originalNum = num;
//         int rev =0;
//         while(num>0){
//             int rem = num%10;
//             rev = (rev * 10) + rem;
//             num = num/10;
//         }
//         if(originalNum == rev){
//             isPalindrome = true;
//         }
//         return isPalindrome;
//     }
//     public static void main(String agr[]){
//         System.out.println(isPalindrome(152));
//     }
// }


public class function {
    public static int sumOfDigits(int num){
        int sum = 0;
        while(num>0){
            int rem  = num%10;
            sum += rem;
            num = num/10;
        }
        return sum;
    }
    public static void main(String agr[]){
        System.out.println(sumOfDigits(152));
    }
}








/*
 * ------------------ The function is mainly 3 types
 * 1. simple function
 * 
 * return_type(){
 * your work
 * return
 * }
 * 2. parameter function
 * 
 * return_type(int , int){
 * return int
 * }
 * 3.
 */
// --------------------------------------------------------------------
/*
 * The value which is define while making the function is called parameter
 * and when it called with some value that is called argument
 */
/*
 * - The functions is stored in memory as CALL STACK
 * - In call by value the actual value did not change
 * - Call by reference change the value but in java there is no call by
 * reference
 */
// ---------------------------------------------------------------------------
/*
 * Function mainly two type :
 * 1. User define function
 * 2. Inbuilt function
 */

/*
 * -----------Function overloading---------------------
 * multiple function in same class with same name but defferent return type..
 */