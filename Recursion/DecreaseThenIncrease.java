public class DecreaseThenIncrease {
    public void DecThenInc(int A) {
        printdec(A);
        System.out.println();  
    }

    public void printdec(int A) {
        if (A <= 0) {  
            System.out.print(A + " ");  
            return;
        }

        System.out.print(A + " ");  
        printdec(A - 1);  
        System.out.print(A + " ");  
    }

    public static void main(String[] args) {
        // Instantiate the correct class
        DecreaseThenIncrease solution = new DecreaseThenIncrease();
        solution.DecThenInc(5);  
    }
}
