//4.2 Binary search (sorted array) — also count iterations
int[] arr = {3,6,9,12,15,18,21,24,27,30};
int x = 18;
int l = 0, r = arr.length-1, iter = 0;
int pos = -1;
while (l <= r) {
    iter++;
    int mid = l + (r - l) / 2;
    if (arr[mid] == x) { pos = mid; break; }
    if (arr[mid] < x) l = mid + 1; else r = mid - 1;
}
System.out.println("pos=" + pos + ", iterations=" + iter);
