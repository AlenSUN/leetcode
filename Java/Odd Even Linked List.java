/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
	public ListNode oddEvenList(ListNode head) {
		// version 1.0
		ListNode odd = null, even = null;
		ListNode oddtail = null, evenhead = null;
		if (head != null) {
			odd = head;
			even = head.next;
			evenhead = head.next;
		}
		while (even != null) {
			if (even.next == null) {
				oddtail = odd;
				break;
			}
			odd.next = even.next;
			odd = odd.next;
			if (odd != null) {
				even.next = odd.next;
				even = even.next;
			}
		}
		if (even == null)
			oddtail = odd;
		if (oddtail != null)
			oddtail.next = evenhead;
		return head;

		// version 1.1
		if (head == null)
			return head;

		ListNode odd = head, even = null, head2;
		if (head.next != null) {
			head2 = even = head.next;
			while (true)
				if (even.next != null) {
					odd.next = even.next;
					odd = odd.next;
					if (odd.next != null) {
						even.next = odd.next;
						even = even.next;
					} else
						break;
				} else
					break;
			odd.next = head2;
			even.next = null;
		}
		return head;
	}
}