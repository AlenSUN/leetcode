/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if (l1 == null)
			return l2;
		if (l2 == null)
			return l1;

		ListNode head = l1.val < l2.val ? l1 : l2;
		ListNode tmp = head;
		if (head == l1)
			l1 = l1.next;
		else
			l2 = l2.next;

		while (l1 != null || l2 != null) {
			ListNode found;
			if (l1 == null)
				found = l2;
			else if (l2 == null)
				found = l1;
			else
				found = l1.val < l2.val ? l1 : l2;
			tmp.next = found;
			tmp = tmp.next;
			if (found == l1)
				l1 = l1.next;
			else
				l2 = l2.next;
		}

		return head;
	}
}