//5.3 Binary search on sorted words (find "mango")
String[] arr = {"apple","banana","cherry","grape","mango","orange","peach","plum"};
String x = "mango";
int l = 0, r = arr.length - 1, pos = -1;
while (l <= r) {
    int mid = (l + r) / 2;
    int cmp = arr[mid].compareTo(x);
    if (cmp == 0) { pos = mid; break; }
    if (cmp < 0) l = mid + 1; else r = mid - 1;
}
System.out.println(pos == -1 ? "Not Found" : "Index " + pos);
