//3) Binary Search for Sorted Words
int binarySearchWords(String[] a, String k){
    int l=0,r=a.length-1;
    while(l<=r){
        int m=(l+r)/2;
        int c=a[m].compareTo(k);
        if(c==0) return m;
        if(c<0) l=m+1; else r=m-1;
    }
    return -1;
}
