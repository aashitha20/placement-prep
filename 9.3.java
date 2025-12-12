class Node {
    String name;
    boolean hasItem;  
    java.util.List<Node> children = new java.util.ArrayList<>();
}

class ItemFinder {
    String find(Node n, String target, String path){
        if(n.hasItem && n.name.equals(target))
            return path + "/" + n.name;

        for(Node child : n.children){
            String res = find(child, target, path + "/" + n.name);
            if(res != null) return res;
        }
        return null;
    }
}
