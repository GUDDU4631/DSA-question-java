public class trapRain42 {
    public int trap(int[] height) {
        int n = height.length;
        //left max boundary
       int[] leftMax = new int[n];
       leftMax[0] = height[0];
       for(int i =1;i<n;i++){
        leftMax[i] = Math.max(leftMax[i-1],height[i]);
       }
        // right max bounday 
        int[] rightMax = new int[n];
        rightMax[n-1] = height[n-1];
        for(int i = n-2;i>=0;i--){
            rightMax[i] = Math.max(rightMax[i+1],height[i]);
        }
        // total trap water
        int trap =0;
        for(int i=0;i<n;i++){
            trap +=  (Math.min(leftMax[i],rightMax[i])-height[i]);
        }
        return trap;
    }
}