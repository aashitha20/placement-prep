//5.4 KMP algorithm (find pattern occurrences)
//KMP involves computing LPS (longest prefix-suffix) array, then scan. Short, complete version:
// compute LPS
int[] computeLPS(String pat) {
    int m = pat.length();
    int[] lps = new int[m];
    int len = 0; lps[0] = 0; int i = 1;
    while (i < m) {
        if (pat.charAt(i) == pat.charAt(len)) lps[i++] = ++len;
        else {
            if (len != 0) len = lps[len-1];
            else lps[i++] = 0;
        }
    }
    return lps;
}

// KMP search
void KMPSearch(String pat, String txt) {
    int n = txt.length(), m = pat.length();
    int[] lps = computeLPS(pat);
    int i = 0, j = 0;
    while (i < n) {
        if (pat.charAt(j) == txt.charAt(i)) { i++; j++; }
        if (j == m) {
            System.out.println("Found at " + (i - j));
            j = lps[j - 1];
        } else if (i < n && pat.charAt(j) != txt.charAt(i)) {
            if (j != 0) j = lps[j - 1]; else i++;
        }
    }
}
