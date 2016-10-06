/**
 * Created by Alessio on 30/09/2016.
 */


public class Tree {

    Node root;
    Node mynode;
    Node parent;
    private int countR = 0;
    private int countL = 0;

    public Tree(int root) {
        this.root = new NodeInt(root);
        mynode = this.root;
        parent = this.root;
    }

    public NodeInt getRoot() {
        return root;
    }

    public void setRoot(NodeInt root) {
        this.root = root;
    }

    public NodeInt insertRight(NodeInt n, int x) throws NodeException {
        if (n.getRight() != null) {
            NodeException exception = new NodeException();
            exception.setN(n.getRight());
            /*countR++;
            if (countR < 50)*/
                throw exception;
        }

        NodeInt mynode = new NodeInt(x);
        parent = n;
        n.setRight(mynode);
        return mynode;
    }

    public NodeInt insertLeft(NodeInt n, int x) throws NodeException {
        if (n.getLeft() != null) {
            NodeException exception = new NodeException();
            exception.setN(n.getLeft());
            countL++;
            /*if (countL<50)
                throw exception;*/
        }
        NodeInt mynode = new Node(x);
        parent = n;
        n.setLeft(mynode);
        return mynode;
    }

    public Node searchFirst(Node n, int x) {
        if (n == null) {
            return null;
        }
        if (n.getItem() == x) {
            return n;

        } else {
            Node found = searchFirst(n.getLeft(), x);
            if (found == null) {
                found = searchFirst(n.getRight(), x);
            }

            return found;
        }
    }

    public void update(Node n, int x) {
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
