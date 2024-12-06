public class Maximumareaofcontainer {
    public static int maxArea(int[] height) {
            int n = height.length;
            int left = 0;
            int right = n-1;
            int result =0;
            while(left<right){
                int width = right - left;
                int area = Math.min(height[left],height[right])* width;
                result = Math.max(result,area);
                if(height[left]<height[right]){
                    left++;
                }
                else{
                    right--;
                }
            }
            return result;
        }
        public static void main(String[] args) {
            int height[] = {1,8,6,2,5,4,8,3,7};
            System.out.println(maxArea(height));
    }
}
