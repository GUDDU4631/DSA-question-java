
class boobleSort {

    public static void booble(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] >= arr[i + 1]) {
                for (int j = 0; j < arr.length - 1 - i; j++) {
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
        }
    }

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
    }

    public static void main(String age[]) {
        // int[] arr = {4,3,1,2,6};
        // int[] arr = {45,2,25,7,3,8,99};
        int[] arr = {1, 2, 3, 4, 5};
        booble(arr);
        printArr(arr);
    }
}
