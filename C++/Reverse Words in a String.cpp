class Solution {
public:
    void reverseWords(string &s) {
        string reverse = "";
        int i, j, l = s.length();
        for (i=l-1; i>=-1; i--) {
            if ((i == -1 || s[i] == ' ') && i + 1 < l && s[i + 1] != ' ') {
                for (j=i+1; j<=l; j++) {
                    if (j == l || s[j] == ' '){
                        reverse += s.substr(i + 1, j - i - 1);
                        reverse += ' ';
                        break;
                    }
                }
            }
        }
        s = reverse.substr(0, reverse.length() - 1);
    }
};
