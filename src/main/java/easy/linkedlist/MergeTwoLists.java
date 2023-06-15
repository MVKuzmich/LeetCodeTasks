package easy.linkedlist;

public class MergeTwoLists {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode result = new ListNode();
        int firstValue;
        int secondValue;
        while (list1.next != null && list2.next != null) {
            firstValue = list1.val;
            secondValue = list2.val;
            if (firstValue < secondValue) {
                result.val = firstValue;
            }
        }
        return new ListNode();
    }
}
