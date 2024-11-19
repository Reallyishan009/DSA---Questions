package Heaps;
import java.util.ArrayList;

public class Heap {
    public static void insert(ArrayList<Integer> list , int val){
        list.add(val);
        upheapify(list, list.size()-1);
    }
    public static void upheapify(ArrayList<Integer>list,int c){
        int p = (c-1)/2;
        while(p>=0 && list.get(p)>list.get(c)){
            swap(list,p,c);
            c=p;
            p=(c-1)/2;

        } 
    }

    public static void swap(ArrayList<Integer>pq,int p,int c){
        int temp = pq.get(p);
        pq.set(p,pq.get(c));
        pq.set(c,temp);
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> heap = new ArrayList<>();
        int[] values = {5, 3, 8, 2, 1, 7};
        
        for (int val : values) {
            insert(heap, val);
        }
        
        System.out.println(heap);
    }
}