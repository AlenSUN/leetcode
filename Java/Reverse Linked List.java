/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
	public ListNode reverseList(ListNode head) {
		ListNode tmp = null;
		if (head != null) {
			tmp = head.next;
			head.next = null;
		}
		while (tmp != null) {
			ListNode third = tmp.next;
			tmp.next = head;
			head = tmp;
			tmp = third;
		}
		return head;
	}
}