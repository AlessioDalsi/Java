
/**
 * Created by Alessio on 30/09/2016.
 */
public class Node {

    private int item;
    private Node left;
    private Node right;

    public int getItem() {
        return item;
    }

    public void setItem(int item) {
        this.item = item;
    }

    public Node(int item) {
        this.item = item;
    }

    public void setLeft(Node n) {
        left = n;
    }

    public Node getLeft(){
        return left;
    }

    public Node getRight(){
        return right;
    }

    public void setRight(Node n) {
        right = n;
    }
}
