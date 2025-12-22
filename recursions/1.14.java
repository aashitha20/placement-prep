//5. Recursive Event Conflict Detection (Events with Sub-Events)
boolean conflict(Event e){
 for(Event a : e.subEvents)
   for(Event b : e.subEvents)
     if(a!=b && a.overlaps(b)) return true;

 for(Event sub : e.subEvents)
     if(conflict(sub)) return true;

 return false;
}
