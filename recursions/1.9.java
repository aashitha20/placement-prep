//4. Trie Word Break (String Segmentation)
boolean canBreak(String s, Trie root, int idx){
 if(idx==s.length()) return true;

 for(int end=idx+1; end<=s.length(); end++){
   if(root.contains(s.substring(idx,end)) && canBreak(s,root,end))
      return true;
 }
 return false;
}

