/**
 * Created by Alessio on 30/09/2016.
 */



public class Tree {

    Node root;
    Node mynode;
    Node parent;

    public Tree(int root) {
        this.root = new Node(root);
        mynode = this.root;
        parent = this.root;
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public Node insertRight(Node n, int x) throws NodeException{
        if (n.getRight() != null) {
            NodeException exception=new NodeException();
            exception.setN(n.getRight());
            throw exception;
        }

        Node mynode = new Node(x);
        parent = n;
        n.setRight(mynode);
        return mynode;
    }

    public Node insertLeft(Node n, int x) throws NodeException {
        if (n.getLeft() != null) {
            NodeException exception=new NodeException();
            n.setLeft(null);
            n.setLeft(n);
            exception.setN(n.getLeft());
            throw exception;
        }
        Node mynode = new Node(x);
        parent = n;
        n.setLeft(mynode);
        return mynode;
    }

    public Node searchFirst(Node n, int x) {
        Node found = new Node();
        if (n == null) {
            return null;
        }
        if (n.getItem() == x) {
            return n;
        }

        Node l = searchFirst(n.getLeft(), x);
        if (l != null) {
            found = l;
        }
        Node k = searchFirst(n.getRight(), x);
        if (k != null) {
            found = k;
        }
        return found;
    }

    public Node searchNode(Node n) {

        Node found = new Node();
        if (n == null) {
            return null;
        }

        Node l = searchNode(n.getLeft());
        if (l != null) {
            found = l;
        }
        Node k = searchNode(n.getRight());
        if (k != null) {
            found = k;
        }
        return found;
    }

    public void update(Node n, int x) {
        n.setItem(x);
    }

    public void delete(Node n){

        if (n.getParent().getLeft() == n){
            n.getParent().setLeft(null);

        }else if (n.getParent().getRight() == n){
            n.getParent().setRight(null);
        }



    }
}
