//1. Robot Path in 3D Grid (Avoid Obstacles, Recursive DFS)
boolean move(int[][][] g,int x,int y,int z){
 if(x<0||y<0||z<0||x>=n||y>=n||z>=n||g[x][y][z]==1) return false;
 if(x==n-1 && y==n-1 && z==n-1) return true;

 g[x][y][z]=1; // mark visited

 return move(g,x+1,y,z) || move(g,x-1,y,z)
     || move(g,x,y+1,z) || move(g,x,y-1,z)
     || move(g,x,y,z+1) || move(g,x,y,z-1);
}
