/**
 * Created by Alessio on 30/09/2016.
 */


public class Tree {

    Node root;
    Node mynode;
    Node parent;
    private int countR = 0;
    private int countL = 0;

    public Tree() {
        this.root = new Node();
        mynode = this.root;
        parent = this.root;
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public Node insertRight(Node n, Node x) throws NodeException {
        if (n.getRight() != null) {
            NodeException exception = new NodeException();
            exception.setN(n.getRight());
            throw exception;
        }

        parent = n;
        n.setRight(mynode);
        return mynode;
    }

    public Node insertLeft(Node n, Node x) throws NodeException {
        if (n.getLeft() != null) {
            NodeException exception = new NodeException();
            exception.setN(n.getLeft());
            countL++;
            /*if (countL<50)
                throw exception;*/
        }
        parent = n;
        Node mynode = x;
        n.setLeft(mynode);
        return mynode;
    }

    public Node searchFirst(Node n, Object item) {
        if (n == null) {
            return null;
        }
        if (n.getItem().equals(item)) {
            return n;

        }
        Node found = searchFirst(n.getLeft(), item);
        if (found == null) {
            found = searchFirst(n.getRight(), item);
        }

        return found;
    }

    public void update(Node n, Object x) {
        n.setItem(x);
    }

    public void delete(Node n) {

        if (n.getParent().getLeft() == n) {
            n.getParent().setLeft(null);

        } else if (n.getParent().getRight() == n) {
            n.getParent().setRight(null);
        }


    }
}
