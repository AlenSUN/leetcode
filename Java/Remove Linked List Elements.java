/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
	public ListNode removeElements(ListNode head, int val) {
		ListNode prev, now;
		if (head == null)
			return head;
		if (head.next != null) {
			prev = head;
			now = head.next;
			while (now != null) {
				if (now.val == val)
					prev.next = now.next;
				else
					prev = prev.next;
				now = now.next;
			}
		}
		if (head.val == val)
			return head.next;
		return head;
	}
}