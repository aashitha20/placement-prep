//4.3 Jump search (sorted) — count comparisons
int[] arr = {2,4,6,8,10,12,14,16,18,20,22,24,26};
int x = 16;
int n = arr.length;
int step = (int)Math.floor(Math.sqrt(n));
int prev = 0;
int comps = 0;
while (prev < n && arr[Math.min(n-1, prev + step - 1)] < x) {
    comps++;
    prev += step;
}
for (int i = prev; i < Math.min(prev+step, n); i++) {
    comps++;
    if (arr[i] == x) { System.out.println("Found at " + i + " comps=" + comps); break; }
}
