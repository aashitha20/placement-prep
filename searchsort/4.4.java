//4.4 Exponential search + binary range
int[] arr = {5,10,15,20,25,30,35,40,45,50,55,60};
int x = 45;
if (arr[0] == x) { System.out.println("0"); }
int bound = 1;
while (bound < arr.length && arr[bound] <= x) bound *= 2;
int left = bound/2;
int right = Math.min(bound, arr.length-1);
System.out.println("binary search in range: " + left + " to " + right);
// then do binary search between left and right
