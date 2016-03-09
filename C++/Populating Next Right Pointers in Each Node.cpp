/**
 * Definition for binary tree with next pointer.
 * struct TreeLinkNode {
 *  int val;
 *  TreeLinkNode *left, *right, *next;
 *  TreeLinkNode(int x) : val(x), left(NULL), right(NULL), next(NULL) {}
 * };
 */
#include <queue>
class Solution {
public:
    void connect(TreeLinkNode *root) {
        queue<TreeLinkNode*> q;
        int m = 1, i = 0;
        if (root != NULL)
            q.push(root);
        while (!q.empty()) {
            TreeLinkNode *temp = q.front();
            if (temp -> left != NULL) {
                q.push(temp -> left);
                q.push(temp -> right);
            }
            q.pop();
            i++;
            if (i == m) {
                temp -> next = NULL;
                i = 0;
                m *= 2;
            } else
                temp -> next = q.front();
        }
    }
};
