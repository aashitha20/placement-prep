//6.2 Reverse digits using while
int n = 12345;
int rev = 0;
while (n > 0) {
    rev = rev * 10 + (n % 10);
    n /= 10;
}
System.out.println("Reversed = " + rev);
