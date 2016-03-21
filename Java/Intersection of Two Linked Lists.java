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
public class Solution {
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		Set<ListNode> s = new HashSet<>();
		while (headA != null || headB != null) {
			if (headA != null) {
				if (!s.add(headA))
					return headA;
				else
					headA = headA.next;
			}
			if (headB != null) {
				if (!s.add(headB))
					return headB;
				else
					headB = headB.next;
			}
		}
		return null;
	}
}