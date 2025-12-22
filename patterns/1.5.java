//1.5 Pascal’s triangle (n rows)
// Pascal's triangle using nCr
static long nCr(int n, int r) {
    long res = 1;
    for (int i = 1; i <= r; i++) {
        res = res * (n - r + i) / i;
    }
    return res;
}

for (int i = 0; i < n; i++) {
    for (int s = 0; s < n - i; s++) System.out.print(" ");
    for (int j = 0; j <= i; j++) {
        System.out.print(nCr(i, j) + (j==i ? "" : " "));
    }
    System.out.println();
}
