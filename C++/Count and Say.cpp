class Solution {
public:
    string countAndSay(int n) {
        if (n <= 0)
            return "";
        int i, j;
        string last = "";
        string here = "1";
        while (--n) {
            last = here;
            here = "";
            for (i=0; i<last.length(); i++) {
                for (j=i; j<last.length()-1; j++) {
                    if (last[j] != last[j+1]) {
                        here += j - i + '1';
                        here += last[j];
                        break;
                    }
                }
                if (j == last.length() - 1) {
                    here += j - i + '1';
                    here += last[j];
                }
                i = j;
            }
        }
        return here;
    }
};
