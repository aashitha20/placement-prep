
//KMP – All Occurrences
int[] lps(String p){
    int m=p.length(),l=0,i=1; int[] a=new int[m];
    while(i<m){
        if(p.charAt(i)==p.charAt(l)) a[i++]=++l;
        else if(l>0) l=a[l-1]; else a[i++]=0;
    }
    return a;
}

List<Integer> kmp(String t, String p){
    List<Integer> res=new ArrayList<>();
    int[] a=lps(p); int i=0,j=0;
    while(i<t.length()){
        if(t.charAt(i)==p.charAt(j)){ i++; j++; }
        if(j==p.length()){ res.add(i-j); j=a[j-1]; }
        else if(i<t.length() && t.charAt(i)!=p.charAt(j))
            j = (j>0 ? a[j-1] : 0);
    }
    return res;
}
