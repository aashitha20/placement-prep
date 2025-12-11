// Rabin–Karp (first occurrence)
int rabinKarp(String t, String p){
    int n=t.length(),m=p.length(),b=256,h=1,mod=101;
    int ph=0,th=0;
    for(int i=0;i<m-1;i++) h=(h*b)%mod;
    for(int i=0;i<m;i++){
        ph=(ph*b+p.charAt(i))%mod;
        th=(th*b+t.charAt(i))%mod;
    }
    for(int i=0;i<=n-m;i++){
        if(ph==th){
            int j=0;
            while(j<m && t.charAt(i+j)==p.charAt(j)) j++;
            if(j==m) return i;
        }
        if(i<n-m){
            th=(b*(th - t.charAt(i)*h) + t.charAt(i+m))%mod;
            if(th<0) th+=mod;
        }
    }
    return -1;
}
