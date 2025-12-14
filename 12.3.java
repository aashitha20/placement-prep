//3. Social Media — Recursive Max Comment Nesting Depth
int depth(Comment c){
 int max = 1;                           // current level
 for(Comment r : c.replies)
     max = Math.max(max, 1 + depth(r)); // deeper nesting
 return max;
}
