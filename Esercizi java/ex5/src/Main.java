/**
 * Created by Alessio on 30/09/2016.
 */
public class Main {


    public static void main(String[] args) throws NodeException {
        Tree t = new Tree(2);
        Node root = t.getRoot();
        Node nx = new Node();
        int counter = 0;
        boolean failed = false;
        NodePerson p=new NodePerson();

        t.insertRight(root, 7);

        do {
            try {
                t.insertRight(root, 7);
            } catch (NodeException exceptionN) {
                if (counter < 50) {
                    System.out.println("Esiste già un nodo in questa posizione. Il nodo precedente verrà sostituito");
                    t.delete(exceptionN.getN());
                    counter++;
                    failed = true;
                    p.setItem();
                } else {
                    System.out.println("Limite di inserimento raggiunto, impossibile inserire il nodo");
                    break;
                }
            }
        } while (counter < 50 && failed == true);

        /*for (int i = 0; i < 50; i++) {
            try {
                nx = t.insertLeft(root, 14);
            } catch (NodeException exception) {
                System.out.println("Esiste già un nodo in questa posizione. Il nodo precedente verrà sostituito");
                t.delete(exception.getN());
                try {
                    nx = t.insertLeft(root, 14);
                } catch (NodeException exception2) {
                    System.out.println("Esiste già un nodo in questa posizione. Il nodo precedente verrà sostituito");
                    t.delete(exception.getN());
                }
                System.out.println(exception.getCounter());
            }
        }*/

        Node n5 = t.searchFirst(root, 7);
        //t.delete(n5);

        t.update(nx, 10);
        Node n3 = t.searchFirst(root, 3);
        System.out.println("n3 != nx " + (n3 != nx));
    }
}
