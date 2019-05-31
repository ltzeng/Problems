package domain;

import java.util.Map;

public class TrieNode {

    private Map<Character, TrieNode> children;
    private char c;
    private boolean isleaf;
    
    
    public TrieNode(char c) {
        this.c=c;
    }
    public Map<Character, TrieNode> getChildren() {
        return children;
    }
    public void setChildren(Map<Character, TrieNode> children) {
        this.children = children;
    }
    public char getC() {
        return c;
    }
    public void setC(char c) {
        this.c = c;
    }
    public boolean isIsleaf() {
        return isleaf;
    }
    public void setIsleaf(boolean isleaf) {
        this.isleaf = isleaf;
    }
    
    
}
