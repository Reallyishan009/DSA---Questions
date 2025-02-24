package Heaps;

public class Insertion2 {
    // Method to insert a value into the heap
    public void insert(int A[], int n, int value) {
        n = n + 1; // Increment heap size
        A[n] = value; // Insert the new value at the end of the heap
        int i = n;

        // Heapify up
        while (i > 1) {
            int parent = i / 2; // Get the parent index
            if (A[i] > A[parent]) {
                swap(A, i, parent); // Swap with the parent if the heap property is violated
                i = parent; // Move up to the parent index
            } else {
                return; // Exit if the heap property is satisfied
            }
        }
    }

    // Method to swap two elements in the array
    public void swap(int A[], int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }

    // Main method
    public static void main(String[] args) {
        // Initialize heap with extra space
        int[] A = new int[10]; 
        A[1] = 50;
        A[2] = 40;
        A[3] = 30;
        int n = 3; // Current size of the heap

        // Create an instance of the class
        Insertion2 insertion = new Insertion2(); 
        int value = 60; // Value to insert

        // Insert value into the heap
        insertion.insert(A, n, value);
        n++; // Update heap size after insertion

        // Print the heap
        System.out.println("Heap after insertion:");
        for (int i = 1; i <= n; i++) {
            System.out.print(A[i] + " ");
        }
    }
}
