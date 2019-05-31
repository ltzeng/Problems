package problems.boundbox;

public class Node {

    private Integer xCoordinate;
    private Integer yCoordinate;
    private boolean visited = false;

    
    public Node(int xCoordinate, int yCoordinate) {
        this.xCoordinate=xCoordinate;
        this.yCoordinate=yCoordinate;
    }
    
    public boolean isVisited() {
        return visited;
    }
    public void setVisited(boolean visited) {
        this.visited = visited;
    }
    public Integer getxCoordinate() {
        return xCoordinate;
    }
    public void setxCoordinate(Integer xCoordinate) {
        this.xCoordinate = xCoordinate;
    }
    public Integer getyCoordinate() {
        return yCoordinate;
    }
    public void setyCoordinate(Integer yCoordinate) {
        this.yCoordinate = yCoordinate;
    }
    
    
}
