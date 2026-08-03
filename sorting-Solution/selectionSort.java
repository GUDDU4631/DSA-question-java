public class selectionSort {
    public static void selection(int[] nums){
        for(int i=0;i<nums.length-1;i++){
            int minPos = i;
            for(int j=i+1;j<nums.length;j++){
                //if the element at i position is large then minPosition is j;
                if(nums[minPos]>nums[j]){
                    minPos = j;
                }
            }
            //Swap the number according to the minPosition 
            int temp = nums[minPos];
            nums[minPos]= nums[i];
            nums[i] = temp;
        }
    }
    public static void printArr(int[] nums){
        for(int i=0; i<nums.length;i++){
            System.out.print(nums[i]+",");
        }
    }
    public static void main(String agr[]){
        int[] nums = {4,5,31,7,6};
        selection(nums);
        printArr(nums);
    }
}
