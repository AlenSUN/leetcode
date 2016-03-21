/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
	public ListNode deleteDuplicates(ListNode head) {
		ListNode tmp = head;
		while (tmp != null) {
			ListNode next = tmp.next;
			while (next != null && next.val == tmp.val)
				next = next.next;
			tmp.next = next;
			tmp = tmp.next;
		}
		return head;
	}
}