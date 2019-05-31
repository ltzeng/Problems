package problems.boundbox;

import java.util.ArrayList;
import java.util.List;

//Contains the board and used to return list of Boxes
public class BoundingBox {

    public List<List<Node>> board = new ArrayList<List<Node>>();
    
    public void createBoard(List<String> inputs) {
        
        for(int y=0; y<inputs.size(); y++) {
            char[] charArr = inputs.get(y).toCharArray();
            List<Node> column = new ArrayList<Node>();
            for(int x=0; x<charArr.length; x++) {
                if(String.valueOf(charArr[x]).equals("*")) {
                    Node node = new Node(x, y);
                    column.add(node);
                }else {
                    column.add(null);
                }
            }
            board.add(column);
        }
    }
    
    
    
    public Node getNodeFromCoordinate(int x, int y) {
        //to make it simpler to pass x and y coordinates
        Node node = null;
        try {
            node = board.get(y).get(x);
        }catch(Exception e) {
            return null;
        }
        return node;
    }
    
    public List<Box> traverseThroughBoard(BoundingBox bb) {
        
        List<Box> boxes = new ArrayList<Box>();
        for(int y=0; y<bb.board.size(); y++) {
            
            for(int x=0; x<bb.board.get(y).size(); x++) {
                Node rootNode = bb.getNodeFromCoordinate(x, y);
                if(rootNode!=null && !rootNode.isVisited()) {
                    Box box = new Box();
                    box.addNodeToBox(rootNode);
                    traverseThroughAdjecentNodes(box, rootNode);
                    boxes.add(box);
                }
            }
        }
        return boxes;
    }
    
    private void traverseThroughAdjecentNodes(Box box, Node rootNode) {
        int x = rootNode.getxCoordinate();
        int y = rootNode.getyCoordinate();
        
        Node childNodeE = getNodeFromCoordinate(x+1, y);
        if (childNodeE!=null && !childNodeE.isVisited()) {
            box.addNodeToBox(childNodeE);
            traverseThroughAdjecentNodes(box, childNodeE);
        }
        
        Node childNodeW = getNodeFromCoordinate(x-1, y);
        if (childNodeW!=null && !childNodeW.isVisited()) {
            box.addNodeToBox(childNodeW);
            traverseThroughAdjecentNodes(box, childNodeW);
        }
        
        Node childNodeS = getNodeFromCoordinate(x, y+1);
        if (childNodeS!=null && !childNodeS.isVisited()) {
            box.addNodeToBox(childNodeS);
            traverseThroughAdjecentNodes(box, childNodeS);
        }
        
        Node childNodeN = getNodeFromCoordinate(x, y-1);
        if (childNodeN!=null && !childNodeN.isVisited()) {
            box.addNodeToBox(childNodeN);
            traverseThroughAdjecentNodes(box, childNodeN);
        }
    }
    
    
    
}
