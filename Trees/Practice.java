import java.util.LinkedList;
import java.util.Queue;

class Node {
    int data;
    Node left, right;

    Node(int d) {
        data = d;
        left = right = null;
    }
}

public class Practice {
    static Node insert(Node root, int key) {
        if (root == null) {
            return new Node(key);
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            Node temp = q.poll();

            if (temp.left == null) {
                temp.left = new Node(key);
                break;
            } else {
                q.add(temp.left);
            }

            if (temp.right == null) {
                temp.right = new Node(key);
                break;
            } else {
                q.add(temp.right);
            }
        }

        return root;
    }

    static void inorder(Node root) {
        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(15);

        int key = 6;
        root = insert(root, key);

        System.out.print("Inorder traversal after insertion: ");
        inorder(root);
        System.out.println();
    }
}
