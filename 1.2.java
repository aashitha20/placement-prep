// Pattern 2 (right aligned)
for (int i = 1; i <= n; i++) {
    // print spaces
    for (int s = 0; s < n - i; s++) System.out.print(" ");
    for (int j = 1; j <= i; j++) {
        System.out.print(j + (j==i ? "" : " "));
    }
    System.out.println();
}
