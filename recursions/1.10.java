//6. Recursive Cell Reproduction (Each Cell Divides into 2 or 3)
long cells(int n){
 if(n==0) return 1;     // starting single cell
 return cells(n-1)*((healthGood)?3:2);  
 // or logic: each parent recursively generates children count
}
