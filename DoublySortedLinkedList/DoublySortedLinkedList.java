package DoublySortedLinkedList;
import java.util.PriorityQueue;
import java.util.Comparator;



class DLLNode {
    int data;
    DLLNode prev, next;

    public DLLNode(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

class DoublySortedLinkedList {
    // Function to sort a k-sorted doubly linked list
    public DLLNode sortAKSortedDLL(DLLNode head, int k) {
        if (head == null) return null;  // If the list is empty

        // Create a min heap to help sort k-sorted doubly linked list
        PriorityQueue<DLLNode> minHeap = new PriorityQueue<>(new Comparator<DLLNode>() {
            public int compare(DLLNode a, DLLNode b) {
                return a.data - b.data;
            }
        });

        DLLNode newHead = null, last = null;

        // Add the first k+1 nodes to the min heap
        DLLNode current = head;
        for (int i = 0; current != null && i <= k; i++) {
            minHeap.add(current);
            current = current.next;
        }

        // Process the heap and add the smallest elements to the result list
        while (!minHeap.isEmpty()) {
            // Extract the minimum node from the heap
            DLLNode minNode = minHeap.poll();

            // Set the new head of the sorted list if it's the first node
            if (newHead == null) {
                newHead = minNode;
                last = newHead;
            } else {
                // Link the last node with the new minimum node
                last.next = minNode;
                minNode.prev = last;
                last = minNode;
            }

            // Add the next node to the heap if available
            if (current != null) {
                minHeap.add(current);
                current = current.next;
            }
        }

        // Mark the end of the list
        last.next = null;

        return newHead;
    }

    // Function to print the doubly linked list
    public void printList(DLLNode head) {
        DLLNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Function to insert a node at the end of the list
    public DLLNode insert(DLLNode head, int data) {
        DLLNode newNode = new DLLNode(data);
        if (head == null) {
            return newNode;
        }
        DLLNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
        return head;
    }

    public static void main(String[] args) {
        DoublySortedLinkedList dll = new DoublySortedLinkedList();
        
        DLLNode head = null;
        head = dll.insert(head, 4978);
        head = dll.insert(head, 15086);
        head = dll.insert(head, 21744);
        head = dll.insert(head, 9656);
        head = dll.insert(head, 9833);
        head = dll.insert(head, 7404);
        head = dll.insert(head, 6800);
        head = dll.insert(head, 23883);
        head = dll.insert(head, 1176);
        head = dll.insert(head, 6373);
        head = dll.insert(head, 29519);
        head = dll.insert(head, 15435);
        head = dll.insert(head, 15896);
        head = dll.insert(head, 12834);
        head = dll.insert(head, 31396);

        System.out.println("Original k-sorted doubly linked list:");
        dll.printList(head);

        int k = 6;  
        
        head = dll.sortAKSortedDLL(head, k);

        System.out.println("Sorted doubly linked list:");
        dll.printList(head);
    }
}
