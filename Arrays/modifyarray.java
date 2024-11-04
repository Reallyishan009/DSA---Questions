import java.util.ArrayList;
import java.util.Arrays;


class modifyarray {
    static ArrayList<Integer> modifyAndRearrangeArr(int arr[]) {
        // Complete the function
        int n = arr.length;
        
        ArrayList<Integer>result = new ArrayList<>();
        
        for(int i=0;i<n;i++){
            result.add(arr[i]);
        }
        
        for(int i =0;i<n-1;i++){
            if(result.get(i).equals(result.get(i+1))){
                result.set(i,2*result.get(i));
                result.set(i+1,0);
            }
        }
        
        ArrayList<Integer>finallist = new ArrayList<>();
        
        for(int i =0;i<n;i++){
            if(result.get(i)!=0){
                finallist.add(result.get(i));
            }
        }
        
        while(finallist.size()<n){
            finallist.add(0);
        }
        
        return finallist;
    }
    public static void main(String[] args) {
       int arr[] = {0, 2, 2, 2, 0, 6, 6, 0, 0, 8} ;
       ArrayList<Integer> modifiedArr = modifyAndRearrangeArr(arr);

        
        System.out.println("Original Array: " + Arrays.toString(arr));
        System.out.println("Modified Array: " + modifiedArr);
    }
}
