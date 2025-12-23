//6.1 Print even numbers 1..50 and count
int count = 0;
for (int i = 1; i <= 50; i++) {
    if (i % 2 == 0) { System.out.print(i + " "); count++; }
}
System.out.println("\nCount = " + count);
