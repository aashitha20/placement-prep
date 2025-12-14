//1. Smart Home Automation — Recursive Device State Propagation
void applyState(Device d, State s){
 d.state = s;  
 for(Device child : d.children)
     applyState(child, s);     // propagate downward
}
