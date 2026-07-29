
// public class array {

//     public static void main(String agr[]) {
//         int num[] = {1, 2, 3, 4, 5};
//         for (int i = 0; i < num.length; i++) {
//             System.out.println(num[i]);
//         }
//     }
// }
 /*
  LINEAR SEARCH
  */
// public class array{
//     public static void linearSearch(int arr[],int key){
//         for(int i=0;i<arr.length;i++){
//             if(arr[i] == key){
//                 System.out.print("At index :" + i);
//             }
//         }
//     }
//     public static void main(String agr[]){
//         int arr[] = {1,2,3,4,5,6,7,8};
//         int key =7;
//         linearSearch(arr, key);
//     }
// }

/*
    LARGEST IN ARRAY
 */
// public class array{
//     public static int largestNum(int arr[]){
//         int largestNum = 0;
//         for(int i =0;i<arr.length-1;i++){
//             if(arr[i]<arr[i+1]){
//                 largestNum = arr[i+1];
//             } else{
//                 largestNum = arr[i];
//             }
//         }
//         return largestNum;
//     }
//     public static void main(String agr[]){
//         int arr[] = {1,3,2,56,67,34,78};
//         System.out.print(largestNum(arr));
//     }
// }

/*
    BINARY SEARCH : only work on sorted array
 */
// public class array{
//     public static int findNum(int arr[],int key){
//         int start = 0;
//         int end = arr.length-1;
//         while(start <= end){
//             int mid = (start+end)/2;
//             if(arr[mid]>key){
//                 end = mid-1;
//             } else if(arr[mid]<key){
//                 start = mid+1;
//             } else if(arr[mid] == key){
//                 return mid;
//             }
//         }
//         return -1;
//     }
//     public static void main(String agr[]){
//         int arr[] ={1,2,4,7,34,65};
//         int key = 7;
//         System.out.print(findNum(arr, key));
//     }
// }