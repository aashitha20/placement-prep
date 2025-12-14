//3. Recursive Merkle Tree Root Construction
String merkle(List<String> hashes){
 if(hashes.size()==1) return hashes.get(0);
 List<String> next = new ArrayList<>();
 for(int i=0;i<hashes.size();i+=2){
   String a = hashes.get(i);
   String b = (i+1<hashes.size()) ? hashes.get(i+1) : a;
   next.add( hash(a + b) );         // combine + hash
 }
 return merkle(next);
}
