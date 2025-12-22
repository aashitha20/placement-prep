//2. Cyber-Security — Recursive Password Permutation Generator
void gen(String pattern, int idx, String cur){
 if(idx == pattern.length()){
    print(cur);
    return;
 }

 char ch = pattern.charAt(idx);

 if(ch == '?'){                         // wildcard → try all allowed chars
    for(char c : allowedChars)
        gen(pattern, idx+1, cur + c);
 }
 else gen(pattern, idx+1, cur + ch);    // fixed character
}
