class Solution {
public:
    int removeDuplicates(int A[], int n) {
        int readPoint = 0, firstPoint = 0, nextPoint = 1;
        while (firstPoint < n) {
            A[readPoint] = A[firstPoint];
            readPoint++;
            if (nextPoint < n) {
                if (A[nextPoint] == A[firstPoint]) {
                    A[readPoint] = A[nextPoint];
                    readPoint++;
                    nextPoint++;
                    if (nextPoint < n) {
                        while (A[nextPoint] == A[firstPoint]) {
                            nextPoint++;
                            if (nextPoint >= n)
                                break;
                        }
                        firstPoint = nextPoint;
                        nextPoint++;
                    } else {
                        break;
                    }
                } else {
                    firstPoint = nextPoint;
                    nextPoint++;
                }
            } else {
                break;
            }
        }
        return readPoint;
    }
};
