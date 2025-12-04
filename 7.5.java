//7.5 Kadane’s algorithm (max subarray of any length)
int maxSoFar = Integer.MIN_VALUE;
int maxEnding = 0;
for (int x : arr) {
    maxEnding = Math.max(x, maxEnding + x);
    maxSoFar = Math.max(maxSoFar, maxEnding);
}
System.out.println(maxSoFar);
