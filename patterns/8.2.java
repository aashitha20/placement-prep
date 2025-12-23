//2) Naive Pattern Matching
int naiveSearch(String t, String p){
    for(int i=0;i<=t.length()-p.length();i++){
        int j=0;
        while(j<p.length() && t.charAt(i+j)==p.charAt(j)) j++;
        if(j==p.length()) return i;
    }
    return -1;
}
