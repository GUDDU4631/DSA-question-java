public class countingSort {
    public static void counting(int nums[]){
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            largest = Math.max(largest, nums[i]);
        }
        int counter[] = new int[largest + 1];
        for (int i = 0; i < nums.length; i++) {
            counter[nums[i]]++;
        }
        int j = 0;
        for (int i = 0; i < counter.length; i++) {
            while (counter[i] > 0) {
                nums[j] = i;
                j++;
                counter[i]--;
            }
        }
    }
    public static void print(int nums[]){
        for(int num : nums){
            System.out.print(num+",");
        }
    }
    public static void main(String agr[]){
        int[] nums = {1,5,1,7,5,3,7};
        counting(nums);
        print(nums);
    }
}
