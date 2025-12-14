//3. Evaluate Binary Expression Tree
double eval(Node n){
 if(n is leaf) return n.value;

 double l = eval(n.left);
 double r = eval(n.right);

 return apply(n.op, l, r);   // +, -, *, /
}
