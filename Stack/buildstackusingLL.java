package Stack;
// using linkedlist
public class buildstackusingLL {
    
    private Node head;
    private int size;

    public buildstackusingLL() {  
        head = null;
        size = 0;
    }

    
    private static class Node {
        int data;
        Node next;
        
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void push(int x) {
        Node temp = new Node(x);
        temp.next = head;
        head = temp;
        size++;
    }

    public int peek() {  
        if (head == null) {
            throw new IllegalStateException("Stack is empty");
        }
        return head.data;
    }

    public int pop() {
        if (head == null) {
            throw new IllegalStateException("Stack is empty");
        }
        int result = head.data;
        head = head.next;
        size--;
        return result;  
    }

    public boolean isEmpty() {  
        return head == null;
    }

    public int size() {
        return size;
    }
}