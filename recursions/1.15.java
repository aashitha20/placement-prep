//4. Recursive Survival Score in Species Dependency Tree
int score(Species s){
 int total = s.baseScore;
 for(Species child : s.dependencies)
     total += score(child);
 return total;
}
