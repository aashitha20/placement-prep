//7.8 Transpose 4x4 matrix & sum of all elements
int sum = 0;
int[][] a = new int[4][4]; // assume filled
for (int i = 0; i < 4; i++) for (int j = 0; j < 4; j++) sum += a[i][j];
int[][] t = new int[4][4];
for (int i = 0; i < 4; i++) for (int j = 0; j < 4; j++) t[j][i] = a[i][j];
System.out.println("Sum = " + sum);
// t is transpose
