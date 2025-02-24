public class maximumcount {
    public int maximumCount(int[] nums) {
        int n = nums.length;

        // Find first non-negative index (first zero or positive number)
        int negCount = findFirstIndex(nums, 0);
        // Find first positive index
        int posCount = n - findFirstIndex(nums, 1);

        return Math.max(negCount, posCount);
    }

    private int findFirstIndex(int[] nums, int target) {
        int left = 0, right = nums.length - 1, index = nums.length;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] >= target) { 
                index = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        maximumcount mc = new maximumcount();
        int[] nums = {-1, -2, -3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(mc.maximumCount(nums));
    }
}
