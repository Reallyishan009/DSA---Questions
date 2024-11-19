package Heaps;

import java.util.ArrayList;

public class Heapsort {
    public static void heapsort(ArrayList<Integer> list) {
        int n = list.size();
        for (int i = n/2 - 1; i >= 0; i--) {
            downheapify(list, n, i);
        }

        
        for (int i = n - 1; i > 0; i--) {
            swap(list, 0, i);
            downheapify(list, i, 0);
        }
    }

    public static void downheapify(ArrayList<Integer> list, int n, int p) {
        int lc = 2 * p + 1;
        int rc = 2 * p + 2;
        int smallest = p;

        if (lc < n && list.get(lc) < list.get(smallest)) {
            smallest = lc;
        }

        if (rc < n && list.get(rc) < list.get(smallest)) {
            smallest = rc;
        }

        if (smallest != p) {
            swap(list, p, smallest);
            downheapify(list, n, smallest);
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
        
        
        for (int val : values) {
            heap.add(val);
        }

        heapsort(heap);
        System.out.println(heap);
    }
}