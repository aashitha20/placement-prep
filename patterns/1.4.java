//1.4 Palindromic number pyramid
// Pattern 4
for (int i = 1; i <= n; i++) {
    // optional leading space for alignment
    for (int s = 0; s < n - i; s++) System.out.print(" ");
    // descending
    for (int j = i; j >= 1; j--) System.out.print(j + " ");
    // ascending from 2
    for (int j = 2; j <= i; j++) System.out.print(j + (j==i ? "" : " "));
    System.out.println();
}
