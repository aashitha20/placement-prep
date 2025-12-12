class FileNode {
    String name;
    boolean isFile;
    java.util.List<FileNode> kids = new java.util.ArrayList<>();
}

class FolderComparator {
    boolean same(FileNode a, FileNode b){
        if(a.isFile != b.isFile) return false;
        if(a.kids.size() != b.kids.size()) return false;

        for(int i=0; i<a.kids.size(); i++)
            if(!same(a.kids.get(i), b.kids.get(i)))
                return false;

        return true;
    }
}
