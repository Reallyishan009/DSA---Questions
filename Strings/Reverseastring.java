package Strings;

public class Reverseastring {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("hello");

        for(int i =0;i<sb.length()/2;i++){
            int front = i;
            int last = sb.length() -1 -i;
            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(last);

            sb.setCharAt(front, backChar);
            sb.setCharAt(last, frontChar);
        }

        System.out.println(sb);
    }
}
