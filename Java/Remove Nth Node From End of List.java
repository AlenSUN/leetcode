/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
	public ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode prev = null, tmp1, tmp2 = head;
		for (int i = 0; i < n; i++)
			tmp2 = tmp2.next;
		tmp1 = head;
		while (tmp2 != null) {
			prev = tmp1;
			tmp1 = tmp1.next;
			tmp2 = tmp2.next;
		}
		if (prev == null)
			return head.next;
		prev.next = tmp1.next;
		return head;
	}
}