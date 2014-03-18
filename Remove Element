class Solution {
public:
    int removeElement(int A[], int n, int elem) {
        int j = n - 1, temp;
        for (int i=0; i<=j; i++)
            if (A[i] == elem) {
                while (A[j] == elem) {
                    j--;
                    if (j < i)
                        break;
                }
                if (j < i)
                    break;
                temp = A[j];
                A[j] = A[i];
                A[i] = temp;
                j--;
            }
        return j + 1;
    }
};
