// OUTPUT 
// *
// **
// ***
// ****
// *****
// ******
// *******
// ********
// *********
// **********

// public class starPattern {
//     public static void main(String agr[]){
//         for(int i=0;i<10;i++){
//             for(int j=0;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.print("\n");
//         }
//     }
// }


// OUTPUT 
// ***********
// **********
// *********
// ********
// *******
// ******
// *****
// ****
// ***
// **
// *
// public class starPattern {
//     public static void main(String agr[]){
//         for(int i=10;i>=0;i--){
//             for(int j=0;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.print("\n");
//         }
//     }
// }


// OUTPUT 
//            *
//           **
//          ***
//         ****
//        *****
//       ******
//      *******
//     ********
//    *********
//   **********
//  ***********

// public class starPattern {
//     public static void main(String agr[]){

//         for(int i=10;i>=0;i--){
//             for(int j=0 ; j<=i;j++){
//                 System.out.print(" ");
//             }
//             for(int k = i; k<=10;k++){
//                 System.out.print("*");
//             }
//             System.out.print("\n");
//         }
//     }
// }


// OUTPUT 
// + + + + + + + + + + + 
// + + + + + + + + + + + 
// + + + + + + + + + + + 
// + + + + + + + + + + + 
// + + + + + + + + + + + 
// + + + + + + + + + + + 
// + + + + + + + + + + + 
// + + + + + + + + + + + 
// + + + + + + + + + + + 
// + + + + + + + + + + + 
// + + + + + + + + + + + 

// public class starPattern {
//     public static void main(String agr[]){

//         for(int i=0;i<=10;i++){
//             for(int j=0 ; j<=10;j++){
//                 System.out.print("+ ");
//             }
//             System.out.print("\n");
//         }
//     }
// }

// OUTPUT
// * * * * * * * * * * *
// *                   *
// *                   *
// *                   *
// *                   *
// *                   *
// *                   *
// *                   *
// *                   *
// *                   *
// * * * * * * * * * * *


// public class starPattern {
//     public static void main(String agr[]) {

//         for (int i = 0; i <= 10; i++) {
//                 for (int j = 0; j <= 10; j++) {
//                     if(j==0 || j==10 || i==0 || i==10){
//                         System.out.print("* ");
//                     } else{
//                         System.out.print("  ");
//                     }
//                 }
            
//             System.out.println("");
//         }
//     }
// }


// OUTPUT 
// 1
// 01
// 101
// 0101
// 10101
// 010101
// 1010101
// 01010101
// 101010101
// 0101010101

// public class starPattern {
//     public static void main(String agr[]) {
//         for (int i = 1; i <= 10; i++) {
//             if(i%2==0){
//                 for(int j =1 ; j<=i;j++){
//                     if(j%2==0){
//                     System.out.print("1");
//                     } else{
//                         System.out.print("0");
//                     }
//                 }
//             } else{
//                 for(int j =1 ; j<=i;j++){
//                     if(j%2==0){
//                         System.out.print("0");
//                     } else{
//                         System.out.print("1");
//                     }
//                 }
//             }
//             System.out.print("\n");
//         }
//     }
// }


// OUTPUT 
// 1 
// 2 3 
// 4 5 6 
// 7 8 9 10 
// 11 12 13 14 15 
// 16 17 18 19 20 21 
// 22 23 24 25 26 27 28 
// 29 30 31 32 33 34 35 36 
// 37 38 39 40 41 42 43 44 45 
// 46 47 48 49 50 51 52 53 54 55 
// 56 57 58 59 60 61 62 63 64 65 66 

// public class starPattern {
//     public static void main(String agr[]) {
//         int num = 1;
//         for (int i = 0; i <= 10; i++) {
//            for(int j =0; j<=i; j++){
//             System.out.print(num+ " ");
//             num++;
//            }
//             System.out.print("\n");
//         }
//     }
// }


// OUTPUT 
//                       + + + + + + + + + + + 
//                     + + + + + + + + + + + 
//                   + + + + + + + + + + + 
//                 + + + + + + + + + + + 
//               + + + + + + + + + + + 
//             + + + + + + + + + + + 
//           + + + + + + + + + + + 
//         + + + + + + + + + + + 
//       + + + + + + + + + + + 
//     + + + + + + + + + + + 
//   + + + + + + + + + + + 

// public class starPattern {
//     public static void main(String agr[]) {
//         for(int i=10; i>=0;i--){
//             for(int j=0;j<=i;j++){
//                 System.out.print("  ");
//             }
//             for(int k=0;k<=10;k++){
//                 System.out.print("+ ");
//             }
//             System.out.print("\n");
//         }
//     }
// }


// OUTPUT 

//                        +  +  +  +  +  +  +  +  +  +  + 
//                      +                             + 
//                    +                             + 
//                  +                             + 
//                +                             + 
//              +                             + 
//            +                             + 
//          +                             + 
//        +                             + 
//      +                             + 
//    +  +  +  +  +  +  +  +  +  +  + 


// public class starPattern {
//     public static void main(String agr[]) {
//         for(int i=10; i>=0;i--){
//             for(int j=0;j<=i;j++){
//                 System.out.print("  ");
//             }
//             for(int k=0;k<=10;k++){
//                 if(k==0 || k==10 || i==0 || i==10){
//                     System.out.print(" + ");
//                 } else{
//                     System.out.print("   ");
//                 }
//             }
//             System.out.print("\n");
//         }
//     }
// }


// OUTPUT 
//            *
//           ***
//          *****
//         *******
//        *********
//       ***********
//      *************
//     ***************
//    *****************
//   *******************
//  *********************

// public class starPattern {
//     public static void main(String agr[]) {
//         for(int i=10;i>=0;i--){
//             for(int j=0 ; j<=i;j++){
//                 System.out.print(" ");
//             }
//             for(int k = i; k<=10;k++){
//                 System.out.print("*");
//             }
//             for(int x = i+1; x<=10;x++){
//                 System.out.print("*");
//             }
//             System.out.print("\n");
//         }
//     }
// }


public class starPattern {
    public static void main(String agr[]) {
        for(int i=10;i>=0;i--){
            int num = 1;
            for(int j=0 ; j<=i;j++){
                System.out.print(" ");
            }
            for(int k = i; k<=10;k++){
                System.out.print(num);
            }
            for(int x = i+1; x<=10;x++){
                System.out.print(num);
            }
            System.out.print("\n");
        }
    }
}
