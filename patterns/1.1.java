// Pattern 1
for (int i = 1; i <= n; i++) {
    for (int j = 1; j <= i; j++) {
        System.out.print(j + (j==i ? "" : " "));
    }
    System.out.println();
}
