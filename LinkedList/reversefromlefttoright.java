package LinkedList;
import java.util.*;


class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) { 
        this.val = val; 
    }

    ListNode(int val, ListNode next) { 
        this.val = val; 
        this.next = next; 
    }
}

public class ReverseFromLeftToRight {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || head.next == null) {
            return head;
        }

        // Dummy node to simplify the process, especially when reversing from the head
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        // Find the node just before the 'left' position
        ListNode beforeLeft = dummy;
        for (int i = 1; i < left; i++) {
            beforeLeft = beforeLeft.next;
        }

        // 'leftNode' is the first node in the section to reverse
        ListNode leftNode = beforeLeft.next;

        // Reverse the nodes between 'left' and 'right'
        ListNode prev = null;
        ListNode current = leftNode;
        for (int i = left; i <= right; i++) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        // Reconnect the reversed portion
        beforeLeft.next = prev; // prev is the new head of the reversed section
        leftNode.next = current; // reconnect the tail of the reversed section to the remaining list

        return dummy.next; // Return the new head of the list
    }

    // Helper method to print the linked list
    public void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        // Example test case to reverse a part of the list
        ReverseFromLeftToRight solution = new ReverseFromLeftToRight();

        // Creating a sample linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.println("Original list:");
        solution.printList(head);

        // Reverse the portion of the list from position 2 to 4
        head = solution.reverseBetween(head, 2, 4);

        System.out.println("List after reversing between position 2 and 4:");
        solution.printList(head);
    }
}
