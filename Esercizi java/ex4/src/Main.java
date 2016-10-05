/**
 * Created by Alessio on 30/09/2016.
 */
public class Main {


    public static void main(String[] args) throws NodeException {
        Tree t = new Tree(2);
        Node root = t.getRoot();
        Node nx=new Node();

        for (int i = 0; i < 50; i++) {
            try {
                nx = t.insertRight(root, 7);
            } catch (NodeException exception) {
                System.out.println("Esiste già un nodo in questa posizione. Il nodo precedente verrà sostituito");
                t.delete(exception.getN());
                nx = t.insertRight(root, 7);
                System.out.println(exception.getCounter());
            }
        }

        for (int i = 0; i < 50; i++) {
            try {
                nx = t.insertLeft(root, 14);
            } catch (NodeException exception) {
                System.out.println("Esiste già un nodo in questa posizione. Il nodo precedente verrà sostituito");
                t.delete(exception.getN());
                nx = t.insertLeft(root, 14);
                System.out.println(exception.getCounter());
            }
        }
        Node n5 = t.searchFirst(root, 7);
        t.delete(n5);

        t.update(nx, 10);
        Node n3 = t.searchFirst(root, 3);
        System.out.println("n3 != nx " + (n3 != nx));
    }
}
