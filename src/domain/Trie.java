package domain;

import java.util.Map;

public class Trie {

    private TrieNode root;
    
    public void insert(String word) {

        Map<Character, TrieNode> children = root.getChildren();
        
        for(int x=0; x< word.length(); x++) {
            char c = word.charAt(x);
            
            TrieNode t;
            if(children.containsKey(c)) {
                t=children.get(c);
            }else {
                t=new TrieNode(c);
                children.put(c, t);
            }
            t.setChildren(children);
            if(x==word.length()-1) {
                t.setIsleaf(true);
            }
        }
        
    }

    public TrieNode getRoot() {
        return root;
    }

    public void setRoot(TrieNode root) {
        this.root = root;
    }
}
