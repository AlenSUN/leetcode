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
            ListNode *secondNode = head -> next;
            while (secondNode != NULL) {
                int firstNum = firstNode -> val;
                int secondNum = secondNode -> val;
                ListNode *thirdNode = secondNode -> next;
                if (firstNum == secondNum) {
                    while (thirdNode != NULL) {
                        int thirdNum = thirdNode -> val;
                        if (secondNum == thirdNum) {
                            secondNode = thirdNode;
                            thirdNode = thirdNode -> next;
                        } else {
                            firstNode = thirdNode;
                            secondNode = thirdNode -> next;
                            head = firstNode;
                            break;
                        }
                    }
                    if (thirdNode == NULL) {
                        head = NULL;
                        break;
                    }
                } else {
                    if (thirdNode != NULL) {
                        int thirdNum = thirdNode -> val;
                        ListNode *forthNode = thirdNode -> next;
                        if (secondNum == thirdNum) {
                            if (forthNode != NULL) {
                                int forthNum = forthNode -> val;
                                if (thirdNum == forthNum) {
                                    secondNode -> next = forthNode;
                                } else {
                                    firstNode -> next = forthNode;
                                    secondNode = forthNode;
                                }
                            } else {
                                firstNode -> next = forthNode;
                                secondNode = forthNode;
                            }
                        } else {
                            firstNode = secondNode;
                            secondNode = thirdNode;
                        }
                    } else {
                        break;
                    }
                }
            }
        }
        return head;
    }
};
