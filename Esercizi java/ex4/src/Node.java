/**
 * Created by Alessio on 06/10/2016.
 */
public class Node {
    private Node left;
    private Node right;
    private Node parent;

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public Node getParent() {
        return parent;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }

    public Node(){}
}
