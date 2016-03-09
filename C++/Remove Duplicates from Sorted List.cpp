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
    ListNode *deleteDuplicates(ListNode *head) {
        if (head != NULL) {
            ListNode *firstNode = head;
            ListNode *nextNode = head -> next;
            while (nextNode != NULL) {
                int num = firstNode -> val;
                int nextNum = nextNode -> val;
                if (nextNum == num) {
                    ListNode *temp = nextNode -> next;
                    firstNode -> next = temp;
                    nextNode = temp;
                } else {
                    firstNode = nextNode;
                    nextNode = nextNode -> next;
                }
            }
        }
        return head;
    }
};
