//2. Recursively Find All Files With Same Content Hash in Nested Folders
void collect(Folder f, Map<String,List<File>> map){
 for(File x : f.files){
   map.computeIfAbsent(x.hash, k->new ArrayList<>()).add(x);
 }
 for(Folder sub : f.subfolders)
   collect(sub, map);               // recurse into subfolders
}

