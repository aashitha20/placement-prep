//5. Recursive Dependency-First Installation Order
void install(Package p, Set<Package> done, List<Package> order){
 if(done.contains(p)) return;

 for(Package dep : p.dependencies)
     install(dep, done, order);     // install dependencies first

 order.add(p);
 done.add(p);
}
