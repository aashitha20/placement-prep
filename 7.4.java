//7.4 Sliding window: max sum of any contiguous subarray of size K
int maxSum = 0;
int windowSum = 0;
for (int i = 0; i < arr.length; i++) {
    windowSum += arr[i];
    if (i >= k) windowSum -= arr[i - k];
    if (i >= k - 1) maxSum = Math.max(maxSum, windowSum);
}
System.out.println(maxSum);
