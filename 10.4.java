//4. Quadtree Compression of Map Region
Node compress(Cell[][] g,int x,int y,int size){
 if(all cells in region match)
     return new Node(g[x][y]);      // leaf with uniform value

 Node n = new Node();               // internal node
 int h = size/2;
 n.q1 = compress(g,x,     y,     h);
 n.q2 = compress(g,x,     y+h,   h);
 n.q3 = compress(g,x+h,   y,     h);
 n.q4 = compress(g,x+h,   y+h,   h);
 return n;
}
