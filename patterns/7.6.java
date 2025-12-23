//7.6 Missing number in 1..n+1 (efficient)
//If array has n distinct integers in 1..n+1, missing number is:
int xor = 0;
int n = arr.length;
for (int i = 0; i < n; i++) xor ^= arr[i];
for (int i = 1; i <= n+1; i++) xor ^= i;
System.out.println("Missing = " + xor);
