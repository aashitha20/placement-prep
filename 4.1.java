//4.1 Linear search (array: [8,15,22,7,19,31,4,13], search 19)
int[] arr = {8,15,22,7,19,31,4,13};
int target = 19;
int idx = -1;
for (int i = 0; i < arr.length; i++) {
    if (arr[i] == target) { idx = i; break; }
}
System.out.println(idx == -1 ? "Not Found" : "Found at index " + idx);
