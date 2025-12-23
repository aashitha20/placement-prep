//7.2 Rotate array to right by k
void rotate(int[] a, int k) {
    int n = a.length;
    k = k % n;
    reverse(a, 0, n-1);
    reverse(a, 0, k-1);
    reverse(a, k, n-1);
}
void reverse(int[] a, int i, int j) {
    while (i < j) { int t = a[i]; a[i++] = a[j]; a[j--] = t; }
}
