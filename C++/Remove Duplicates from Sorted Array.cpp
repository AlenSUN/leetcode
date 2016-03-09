class Solution {
public:
    int removeDuplicates(int A[], int n) {
        int readPoint = 0, firstPoint = 0, nextPoint = 1;
        while (firstPoint < n) {
            A[readPoint] = A[firstPoint];
            readPoint++;
            if (nextPoint < n) {
                while (A[firstPoint] == A[nextPoint]) {
                    nextPoint++;
                    if (nextPoint >= n) {
                        break;
                    }
                }
                firstPoint = nextPoint;
                nextPoint++;
            } else {
                break;
            }
        }
        return readPoint;
    }
};
