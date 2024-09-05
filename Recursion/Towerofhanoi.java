package Recursion;
import java.util.ArrayList;
    public class Towerofhanoi {
        public ArrayList<ArrayList<Integer>> towerOfHanoi(int A) {
            ArrayList<ArrayList<Integer>> list = new ArrayList<>();
            hanoi(A,1,3,2,list);
            return list;
        }
        public void hanoi(int disk, int start, int destination, int temp, ArrayList<ArrayList<Integer>>result){
            if(disk ==0){
                return;
            }
            hanoi(disk-1,start,temp,destination,result);
            ArrayList<Integer>move = new ArrayList<>();
            move.add(disk);
            move.add(start);
            move.add(destination);
            result.add(move);
            hanoi(disk-1,temp,destination,start,result);
    
    
        }
    }
