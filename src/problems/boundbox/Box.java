package problems.boundbox;

import java.util.ArrayList;
import java.util.List;

//is the box object we are looking to print out
public class Box {

    List<Node> nodeList = new ArrayList<Node>();
    
    private Integer minX;
    private Integer minY;
    private Integer maxX;
    private Integer maxY;
    
    
    public void addNodeToBox(Node node) {
        nodeList.add(node);
        setMinMax(node);
        node.setVisited(true);
    }
    
    public void setMinMax(Node node) {
        
        int x = node.getxCoordinate();
        int y = node.getyCoordinate();
        
        if(getMaxX()==null) {
            setMaxX(x);
            setMinX(x);
        }else {
            if(getMaxX()<x) {
                setMaxX(x);
            }
            if(getMinX()>x) {
                setMinX(x);
            }
        }
        
        if(getMaxY()==null) {
            setMaxY(y);
            setMinY(y);
        }else {
            if(getMaxY()<y) {
                setMaxY(y);
            }
            if(getMinY()>y) {
                setMinY(y);
            }
        }
    }
    
    
    public List<Node> getNodeList() {
        return nodeList;
    }
    public void setNodeList(List<Node> nodeList) {
        this.nodeList = nodeList;
    }
    public Integer getMinX() {
        return minX;
    }
    public void setMinX(Integer minX) {
        this.minX = minX;
    }
    public Integer getMinY() {
        return minY;
    }
    public void setMinY(Integer minY) {
        this.minY = minY;
    }
    public Integer getMaxX() {
        return maxX;
    }
    public void setMaxX(Integer maxX) {
        this.maxX = maxX;
    }
    public Integer getMaxY() {
        return maxY;
    }
    public void setMaxY(Integer maxY) {
        this.maxY = maxY;
    }
}
