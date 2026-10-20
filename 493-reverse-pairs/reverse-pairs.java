class Solution {
    public int reversePairs(int[] nums) {
        return mergeSort(nums, 0, nums.length - 1);
        
    }

    private int mergeSort(int[]arr, int start, int end){
        int count = 0;
        if(start >= end) return 0;
        int mid = start + ( end - start)/2;
        count += mergeSort(arr,start,mid);
        count += mergeSort(arr,mid+1,end);
        count += countCrossPair(arr , start, mid, end);
        merger(arr, start, mid, end );
        return count;
    }
    private int countCrossPair(int[] arr, int start, int mid, int end){
        int count =0;
        int rightPointer = mid + 1;
 
        // Count how many right-half values are valid for each left-half value.
        for (int leftPointer = start; leftPointer <= mid; leftPointer++) {
            long leftValue = arr[leftPointer];
 
            // Move across right-half values that satisfy the reverse-pair condition.
            while (rightPointer <= end && leftValue > 2L * arr[rightPointer]) {
                rightPointer++;
            }
 
            count += rightPointer - (mid + 1);
        }
        return count;
    }
    private void merger(int[] arr, int si, int mid, int ei){
        int temp[] = new int[ei - si +1];
        int i = si;
        int j = mid +1;
        int k =0;
        while(i <=  mid && j <= ei){
            if(arr[i] <= arr[j]){
                temp[k] = arr[i];
                i++;
            } else if(arr[i] >= arr[j]){
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        while(i<=mid)
            temp[k++] = arr[i++];
        while(j <= ei)
            temp[k++] = arr[j++];

        for(k =0 ,i = si;k<temp.length;i++,k++){
            arr[i] = temp[k];
        }
    }

}