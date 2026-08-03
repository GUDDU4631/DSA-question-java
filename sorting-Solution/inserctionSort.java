
public class inserctionSort {

    public static void insertion(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            int prev = i - 1;
            int curr = nums[i];
            //for finding current smallest number in array
            while (prev >= 0 && nums[prev] > curr ) {
                nums[prev + 1] = nums[prev];
                prev--;
            }
            //inserction
            nums[prev + 1] = curr;
        }
    }

    public static void printArr(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + ",");
        }
    }

    public static void main(String agr[]) {
        int[] nums = {4,5,1,78,3,77};
        insertion(nums);
        printArr(nums);
    }
}
