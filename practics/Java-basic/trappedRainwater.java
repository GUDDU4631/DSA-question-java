public class trappedRainwater{
    public static int trappedWater(int height[]){
        int n = height.length;
        //leftMax_bounday
        int[] leftMax_boundary = new int[n];
        leftMax_boundary[0] = height[0];
        for(int i=1;i<n;i++){
            leftMax_boundary[i] = Math.max(leftMax_boundary[i-1],height[i]);
        }
        //RightMax_boundary
        int[] rightMax_boundary = new int[n];
        rightMax_boundary[n-1] = height[n-1];
        for(int i= n-2;i>=0;i--){
            rightMax_boundary[i] = Math.max(rightMax_boundary[i+1],height[i]);
        }
        //trapped water 
        int trappedWater = 0;
        for(int i=0;i<n;i++){
             trappedWater += (Math.min(leftMax_boundary[i],rightMax_boundary[i])- height[i]);
        }
        return trappedWater;
    }
    public static void main(String agr[]){
        int[] height = {4,2,0,6,3,2,5};
        System.out.print(trappedWater(height));
    }
}