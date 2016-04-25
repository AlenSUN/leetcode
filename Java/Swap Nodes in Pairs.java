/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
	public ListNode swapPairs(ListNode head) {
		ListNode node = head;
		if (head != null && head.next != null)
			head = head.next;
		while (node != null && node.next != null) {
			ListNode next = node.next;
			node.next = next.next;
			next.next = node;
			if (node.next != null && node.next.next != null) {
				ListNode temp = node.next;
				node.next = node.next.next;
				node = temp;
			} else
				node = node.next;
		}
		return head;
	}
}