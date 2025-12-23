//7.3 Two-pointer pair with given sum in sorted array
int[] arr = {...}; int target = K;
int l = 0, r = arr.length - 1;
boolean found = false;
while (l < r) {
    int s = arr[l] + arr[r];
    if (s == target) { found = true; break; }
    if (s < target) l++; else r--;
}
System.out.println(found ? "Yes" : "No");
