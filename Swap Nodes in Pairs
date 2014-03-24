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
    ListNode *swapPairs(ListNode *head) {
        ListNode *first = head;
        ListNode *next = NULL;
        ListNode *last = NULL;
        if (first != NULL) {
            next = first -> next;
            if (next != NULL) {
                head = next;
                last = first;
                first = next -> next;
                next -> next = last;
                last -> next = NULL;
            } else
                return head;
        }
        while (first != NULL) {
            next = first -> next;
            if (next != NULL) {
                last -> next = next;
                last = first;
                first = next -> next;
                next -> next = last;
                last -> next = NULL;
            } else {
                last -> next = first;
                first = NULL;
            }
        }
        return head;
    }
};
