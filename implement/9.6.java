class Task { boolean done; }
class Module {
    java.util.List<Module> subs = new java.util.ArrayList<>();
    java.util.List<Task> tasks = new java.util.ArrayList<>();
}

class CourseTracker {
    int countCompleted(Module m){
        int c = 0;
        for(Task t : m.tasks) if(t.done) c++;
        for(Module sub : m.subs) c += countCompleted(sub);
        return c;
    }
}
