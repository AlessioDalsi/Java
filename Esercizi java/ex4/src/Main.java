/**
 * Created by Alessio on 30/09/2016.
 */
public class Main {


    public static void main(String[] args) {
        Tree t = new Tree(2);
        Node root = t.getRoot();
        t.insertLeft(root, 3);
        Node nx = t.insertRight(root, 3);
        t.insertRight(nx, 5);

        Node n5 = t.searchFirst(root, 5);
        t.delete(n5);

        t.update(nx, 10);
        Node n3 = t.searchFirst(root, 3);
        System.out.println("n3 != nx " + (n3 != nx));
    }
}
