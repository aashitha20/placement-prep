//6.4 Print 1..20 skipping multiples of 3, stop if >15
for (int i = 1; i <= 20; i++) {
    if (i > 15) break;
    if (i % 3 == 0) continue;
    System.out.print(i + " ");
}
