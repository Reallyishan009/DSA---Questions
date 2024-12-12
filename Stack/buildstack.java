package Stack;

public class Buildstack {
    private int[] A;
    private int top;
    private int capacity;

    public Buildstack(int capacity) {
        this.capacity = capacity;
        top = -1;
        A = new int[capacity];
    }

    public void push(int x) {
        if (top == capacity - 1) {
            throw new IllegalStateException("Stack is full");
        }
        top++;
        A[top] = x;
    }

    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        int result = A[top];
        top--;
        return result;
    }

    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return A[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }
}