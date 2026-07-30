/*
    REVERSE AN ARRAY
 */
// public class array1 {

//     public static void revArr(int arr[]) {
//         int start = 0;
//         int end = arr.length - 1;
//         while (start < end) {
//             int temp = arr[start];
//             arr[start] = arr[end];
//             arr[end] = temp;
//             start++;
//             end--;
//         }
//     }
//     public static void main(String agr[]) {
//         int arr[] = {1, 2, 3, 4, 5};
//         revArr(arr);
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i]);
//         }
//     }
// }

/*
    pair of an array
    OUTPUT= {
    (1,2)(1,3)(1,4)(1,5)
(2,3)(2,4)(2,5)
(3,4)(3,5)
(4,5)

    }
 */
// public class array1 {

//     public static void pairOfArr(int arr[]) {
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = i + 1; j < arr.length; j++) {
//                 System.out.print("(" + arr[i] + "," + arr[j] + ")");
//             }
//             System.out.print("\n");
//         }
//     }

//     public static void main(String agr[]) {
//         int arr[] = {1, 2, 3, 4, 5};
//         pairOfArr(arr);
//     }
// }

/* 
    Sub-array of an array
OUTPUT = {
    1, 
1, 2, 
1, 2, 3, 
1, 2, 3, 4, 
1, 2, 3, 4, 5, 

2, 
2, 3, 
2, 3, 4, 
2, 3, 4, 5, 

3, 
3, 4, 
3, 4, 5, 

4, 
4, 5, 

5, 
} */
// public class array1 {
//     public static void subArray(int arr[]) {
//         for(int i =0 ; i< arr.length;i++){
//             for(int j=i;j<arr.length;j++){
//                 for(int k=i;k<=j;k++){
//                     System.out.print(arr[k]+","+" ");
//                 }
//                 System.out.print("\n");
//             }
//             System.out.print("\n");
//         }
//     }
//     public static void main(String agr[]) {
//         int arr[] = {1, 2, 3, 4, 5};
//         subArray(arr);
//     }
// }
/*
    Max value of subArray 
 */
// OUTPUT = 8
// public class array1 {
//     public static void subArray(int arr[]) {
//         int maxSum = Integer.MIN_VALUE;
//         int currSum = 0;
//         for(int i =0 ; i< arr.length;i++){
//             for(int j=i;j<arr.length;j++){
//                 currSum = 0;
//                 for(int k=i;k<=j;k++){
//                     currSum = currSum + arr[k];
//                 }
//                 if(maxSum < currSum){
//                     maxSum = currSum;
//                 }
//             }
//         }
//         System.out.print(maxSum);
//     }
//     public static void main(String agr[]) {
//         int arr[] = {1,-2,6,-1,3};
//         subArray(arr);
//     }
// }
