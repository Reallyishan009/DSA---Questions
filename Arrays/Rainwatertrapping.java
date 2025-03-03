public class Rainwatertrapping {
    public static int maxtotalArea(int[] height) {
        int n = height.length;
        int left[] = new int[n];
        int right[] = new int[n];
        
        
        left[0] = height[0];
        for(int i = 1; i < n; i++){
            left[i] = Math.max(left[i-1], height[i]);
        }
        

        right[n-1] = height[n-1];
        for(int j = n-2; j >= 0; j--){
            right[j] = Math.max(right[j+1], height[j]);
        }
        
        
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += (Math.min(left[i], right[i]) - height[i]);
        }
        
        return sum;
    }
    
    public static void main(String[] args) {
        int height[] = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxtotalArea(height));
    }
}
