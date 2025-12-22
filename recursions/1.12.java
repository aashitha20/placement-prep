//2. Recursive String Encryption (Divide String Into Two Halves)
String encrypt(String s){
 if(s.length()<=1) return s;
 int mid = s.length()/2;
 return encrypt(s.substring(0,mid)) 
      + encrypt(s.substring(mid));   // apply encryption on halves
}
