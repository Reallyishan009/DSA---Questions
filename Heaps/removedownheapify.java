package Heaps;

import java.util.ArrayList;

public class removedownheapify {
    public static int remove(ArrayList<Integer> list) {
        if (list.isEmpty()) {
            throw new IllegalStateException("Heap is empty");
        }
        
        int n = list.size();
        swap(list, 0, n - 1);
        int min = list.remove(n - 1);
        
        if (!list.isEmpty()) {
            downheapify(list, 0);
        }
        
        return min;
    }
    
    public static void downheapify(ArrayList<Integer> list, int p) {
        int n = list.size();
        int lc = 2 * p + 1;
        int rc = 2 * p + 2;

        while (lc < n) {
            int minidx = p;
            
            // Check left child
            if (lc < n && list.get(lc) < list.get(minidx)) {
                minidx = lc;
            }
            
            // Check right child
            if (rc < n && list.get(rc) < list.get(minidx)) {
                minidx = rc;
            }
            
            // If parent is not minimum, swap
            if (minidx != p) {
                swap(list, p, minidx);
                p = minidx;
                lc = 2 * p + 1;
                rc = 2 * p + 2;
            } else {
                break;
            }
        }
    }
    
    public static void swap(ArrayList<Integer> list, int p, int c) {
        int temp = list.get(p);
        list.set(p, list.get(c));
        list.set(c, temp);
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> heap = new ArrayList<>();
        int[] values = {5, 3, 8, 2, 1, 7};
        
        // Build heap
        for (int val : values) {
            heap.add(val);
        }
        
        System.out.println("Original Heap: " + heap);
        int removedMin = remove(heap);
        System.out.println("Removed: " + removedMin);
        System.out.println("Heap after removal: " + heap);
    }
}