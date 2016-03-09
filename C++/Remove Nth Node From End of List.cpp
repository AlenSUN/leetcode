/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class Solution {
public:
    ListNode *removeNthFromEnd(ListNode *head, int n) {
        ListNode *now = head, *then = head, *last = NULL;
        for (int i=0; i<n; i++) {
            then = then -> next;
        }
        while (then != NULL) {
            last = now;
            now = now -> next;
            then = then -> next;
        }
        if (now == head) {
            return head -> next;
        } else {
            last -> next = now -> next;
            return head;
        }
    }
};
