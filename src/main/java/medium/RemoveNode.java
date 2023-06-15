package medium;


public class RemoveNode {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode first = head;

        // Second pointer will point to the Nth node from the beginning
        ListNode second = head;
        for (int i = 0; i < n; i++) {

            // If count of nodes in the given linked list is <= N
            if (second.next == null) {
                // If count = N i.e. delete the head node
                if (i == n - 1) {
                    head = head.next;
                    return head;
                }
            }
            second = second.next;
        }

        // Increment both the pointers by one until second pointer reaches the end
        while (second.next != null) {
            first = first.next;
            second = second.next;
        }

        // First must be pointing to the Nth node from the end by now. So, delete the node first is pointing to
        first.next = first.next.next;
        return head;
    }
}
