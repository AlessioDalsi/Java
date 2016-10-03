/**
 * Created by Alessio on 30/09/2016.
 */


public class Tree {

    Node root;
    Node mynode;

    public Tree(int root) {
        this.root = new Node(root);
        mynode = this.root;
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public Node insertRight(Node n, int x) {
        if (n.getRight() != null) {
            return null;
        }

        Node mynode = new Node(x);
        n.setRight(mynode);
        return mynode;
    }

    public Node insertLeft(Node n, int x) {
        if (n.getLeft() != null) {
            return null;
        }
        Node mynode = new Node(x);
        n.setLeft(mynode);
        return mynode;
    }

    public Node searchFirst(Node n, int x) {
        if (n == null) {
            return null;
        }
        if (n.getItem() == x) {
            return n;
        }

        Node l=searchFirst(n.getLeft(), x);
        if(l!=null){
            return l;
        }
        Node k=searchFirst(n.getRight(), x);
        if (k != null) {
            return k;
        }
        return l;
    }

    public void update(Node n, int x) {
        n.setItem(x);
    }

    public void delete(Node n) {
        if (mynode.getRight() == n) {
            mynode.setRight(null);
        } else if (mynode.getLeft() == n) {
            mynode.setLeft(null);
        }
    }
}
