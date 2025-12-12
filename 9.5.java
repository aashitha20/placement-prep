class Symptom {
    String name;
    java.util.List<Symptom> next = new java.util.ArrayList<>();
}

class DiagnosisSystem {
    void tracePaths(Symptom s, String path){
        if(s.next.isEmpty()){
            System.out.println(path + " -> " + s.name);
            return;
        }
        for(Symptom child : s.next)
            tracePaths(child, path + " -> " + s.name);
    }
}
