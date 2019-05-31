package problems.boundbox;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StartBoundingBox {

    public static void main(String[] args) {
        
        //generate board
        BoundingBox bb = createBoard(getInputsFile());
        //get list of "box" types
        List<Box> boxes = bb.traverseThroughBoard(bb);
        //find overlap and filter
        boxes=findOverlap(boxes);
        //print out answers
        printOutCoordinates(boxes);
    }
    
    private static BoundingBox createBoard(List<String> inputs) {
        BoundingBox bb = new BoundingBox();
        bb.createBoard(inputs);
        return bb;
    }

    private static List<String> getInputsFile() {
        BufferedReader reader;
        List<String> inputs = new ArrayList<String>();
        try {
            reader = new BufferedReader(new FileReader("groups.txt"));
            String line = reader.readLine();
            while (line != null) {
                inputs.add(line);
                line = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return inputs;
    }
    
    private static List<Box> findOverlap(List<Box> boxes) {
        Map<String, Integer> takenSpaces = new HashMap<String, Integer>();
        List<Box> goodBoxes = new ArrayList<Box>();
        for(Box box : boxes) {
            for(int x = box.getMinX(); x<=box.getMaxX(); x++) {
                for(int y = box.getMinY(); y<=box.getMaxY(); y++) {
                    Integer counter = takenSpaces.get(x+","+y);
                    if(counter==null) {
                        takenSpaces.put(x+","+y, 1);
                    }else {
                        takenSpaces.put(x+","+y, counter+1);
                    }
                }
            }
        }
        for(Box box : boxes) {
            boolean overlapped = false;
            for(int x = box.getMinX(); x<=box.getMaxX(); x++) {
                for(int y = box.getMinY(); y<=box.getMaxY(); y++) {
                    if(takenSpaces.get(x+","+y)>1) {
                        overlapped=true;
                    }
                }
            }
            if(!overlapped) {
                goodBoxes.add(box);
            }
        }
        
        
        return goodBoxes;
    }
    
    private static void printOutCoordinates(List<Box> boxes) {
        
        for(Box box : boxes) {
            int minx = box.getMinX()+1;
            int miny = box.getMinY()+1;
            int maxx = box.getMaxX()+1;
            int maxy = box.getMaxY()+1;
            System.out.println("("+minx + "," + miny + ")(" + maxx + "," + maxy + ")");
        }
    }

    
    
}
