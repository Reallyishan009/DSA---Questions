/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class deleteatkthindex {
    public ListNode solve(ListNode A, int B) {
        // If we need to remove the head of the list
        if (B == 0) {
            return A.next;
        }
        
        ListNode current = A;
        int position = 0;
        
        // Traverse the list to find the node just before the one to be deleted
        while (current != null && position < B - 1) {
            current = current.next;
            position++;
        }
        
        // If we are at a valid node, and the next node exists
        if (current != null && current.next != null) {
            current.next = current.next.next; // Remove the Bth node
        }
        
        return A;
    }
}
