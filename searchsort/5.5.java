//5.5 Rabin–Karp (rolling hash) — simple implementation
void rabinKarp(String txt, String pat) {
    int n = txt.length(), m = pat.length();
    int d = 256; // alphabet size
    int q = 101; // prime
    int h = 1;
    for (int i = 0; i < m - 1; i++) h = (h * d) % q;
    int p = 0, t = 0;
    for (int i = 0; i < m; i++) {
        p = (d * p + pat.charAt(i)) % q;
        t = (d * t + txt.charAt(i)) % q;
    }
    for (int i = 0; i <= n - m; i++) {
        if (p == t) {
            int j;
            for (j = 0; j < m; j++) if (txt.charAt(i + j) != pat.charAt(j)) break;
            if (j == m) System.out.println("Found at " + i);
        }
        if (i < n - m) {
            t = (d * (t - txt.charAt(i) * h) + txt.charAt(i + m)) % q;
            if (t < 0) t += q;
        }
    }
}
