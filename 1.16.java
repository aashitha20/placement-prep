//6. Recursive Climate Cell Average in Quadtree (Weather Simulation)
double avg(Cell c){
 if(c.isLeaf()) return c.temperature;

 double sum=0;
 for(Cell child : c.children)
     sum += avg(child);

 return sum / c.children.size();
}
