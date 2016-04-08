/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
// use two pointers, see the approach #3 of editorial solution
// brief explanation: a + c + b = b + c + a 
public class Solution {
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		if (headA == null || headB == null)
			return null;

		ListNode nodeA = headA, nodeB = headB;
		ListNode tailA = null, tailB = null;
		while (nodeA != nodeB) {
			if (nodeA.next == null) {
				tailA = nodeA;
				if (tailB != null && tailA != tailB)
					return null;
				nodeA = headB;
			} else
				nodeA = nodeA.next;
			if (nodeB.next == null) {
				tailB = nodeB;
				if (tailA != null && tailA != tailB)
					return null;
				nodeB = headA;
			} else
				nodeB = nodeB.next;
		}
		return nodeA;
	}
}