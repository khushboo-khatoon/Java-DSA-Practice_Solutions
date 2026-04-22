 public class trappingRainWater {
public int trap(int[] height) {
        int n=height.length;
        int total=0;
        int[] leftMax=new int[n];
        int[] rightMax=new int[n];
         
         leftMax[0]=height[0];
        for(int i=1;i<n;i++){
            leftMax[i]=Math.max(leftMax[i-1],height[i]);
        }
          rightMax[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            rightMax[i]=Math.max(rightMax[i+1],height[i]);

        }

        for(int i=0;i<n;i++){
                       if(height[i]<leftMax[i] && height[i]<rightMax[i]){
                        total+=Math.min(rightMax[i],leftMax[i])-height[i];
                       }
        }
        return total ;
        
    }
    public static void main(String[] args) {
        trappingRainWater obj = new trappingRainWater();
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        int result = obj.trap(height);
        System.out.println(result); // Output: 6
    }
    
}
