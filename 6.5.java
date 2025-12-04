//6.5 Prime numbers 1..100 (nested loops)
for (int i = 2; i <= 100; i++) {
    boolean isPrime = true;
    for (int j = 2; j*j <= i; j++) {
        if (i % j == 0) { isPrime = false; break; }
    }
    if (isPrime) System.out.print(i + " ");
}
