public class CredQUESTION {
    public static int smallestSubarrayWithMinMax(int[] arr) {
        int n = arr.length;
        int minElem = Integer.MAX_VALUE, maxElem = Integer.MIN_VALUE;
        
        // Step 1: Find the min and max elements in the array
        for (int i = 0; i < n; i++) {
            minElem = Math.min(minElem, arr[i]);
            maxElem = Math.max(maxElem, arr[i]);
        }

        // If the array contains only one distinct element
        if (minElem == maxElem) {
            return 1;
        }

        // Step 2: Find the smallest subarray containing both minElem and maxElem
        int lastMinIndex = -1, lastMaxIndex = -1;
        int minLength = n; // Max possible length is n

        for (int i = 0; i < n; i++) {
            if (arr[i] == minElem) {
                lastMinIndex = i;
            }
            if (arr[i] == maxElem) {
                lastMaxIndex = i;
            }

            // If both have been seen, calculate the subarray length
            if (lastMinIndex != -1 && lastMaxIndex != -1) {
                int currentLength = Math.abs(lastMinIndex - lastMaxIndex) + 1;
                minLength = Math.min(minLength, currentLength);
            }
        }
        return minLength;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 1, 4, 3, 5, 5, 1};
        System.out.println(smallestSubarrayWithMinMax(arr));  // Output: 3
    }
}
