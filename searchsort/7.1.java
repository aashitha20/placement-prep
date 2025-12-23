//7.1 Count frequency of each element (use HashMap)
int[] arr = {1,2,2,3,1,4,2};
Map<Integer,Integer> freq = new HashMap<>();
for (int x : arr) freq.put(x, freq.getOrDefault(x,0)+1);
System.out.println(freq);
