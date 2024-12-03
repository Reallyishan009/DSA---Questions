import java.util.Arrays;

public class RotatetoarrayRtoLKtimes {
    public static void rotateRightToLeft(int[] arr, int k) {
        int n = arr.length;
        if (n == 0 || k <= 0) return;

        k %= n; 
        reverse(arr, 0, n - 1);        
        reverse(arr, 0, k - 1);       
        reverse(arr, k, n - 1);       
    }

    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        int k = 3; 
        System.out.println("Original Array: " + Arrays.toString(array));
        rotateRightToLeft(array, k);
        System.out.println("Rotated Array: " + Arrays.toString(array));
    }
}
