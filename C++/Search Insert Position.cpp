class Solution {
public:
    int searchInsert(int A[], int n, int target) {
        if (A[0] >= target)
            return 0;
        if (A[n-1] < target)
            return n;
        for (int i=1; i<n; i++) {
            if (A[i] == target)
                return i;
            if (A[i-1] < target && A[i] > target)
                return i;
        }
    }
};
