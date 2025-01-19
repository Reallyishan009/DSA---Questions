package Heaps;

public class insertion2 {
    public void insert(int A[],int n , int value){
        n = n+1;
        A[n] = value;
        int i = n;

        while(i>1){
            int parent = i/2;
            if(A[i]>A[parent]){
                swap(A,i,value);
                i= parent;
            }
            else{
                return;
            }
        }
    }

    public void swap(int A[], int i , int j){
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }

    public static void main(String[] args) {
        // Create a heap array with extra space (1-based indexing)
        int[] A = new int[10]; 
        A[1] = 50;
        A[2] = 40;
        A[3] = 30;
        int n = 3; // Current size of the heap

        Insertion insertion = new Insertion();
        int value = 10; // Value to be inserted

        insertion.insert(A, n, value);
        n++; // Update heap size after insertion

        // Print the heap
        for (int i = 1; i <= n; i++) {
            System.out.print(A[i] + " ");
        }
    }

}
