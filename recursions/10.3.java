//3. Recursively Compute Total Processing Time of Ticket + Sub-tickets
int totalTime(Ticket t){
 int sum = t.timeRequired;
 for(Ticket sub : t.subTickets)
     sum += totalTime(sub);         // add recursive subtree time
 return sum;
}
