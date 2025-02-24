package Heaps;

import java.util.PriorityQueue;

public class FindRopeMinimumCost {
    public static int rope(int A[]) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int totalCost = 0;

        
        for (int value : A) {
            pq.add(value);
        }

       
        while (pq.size() > 1) {
            int cost = pq.remove() + pq.remove(); /
            totalCost += cost; 
            pq.add(cost); 
        }

        return totalCost;
    }

    public static void main(String[] args) {
        int[] A = {4, 3, 2, 6}; 
        int result = rope(A);
        System.out.println("Minimum cost to connect ropes: " + result);
    }
}
