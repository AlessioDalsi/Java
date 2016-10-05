/**
 * Created by Alessio on 04/10/2016.
 */
public class NodeException extends Exception {

    private Node n;
    private int counter;

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public Node getN() {
        return n;
    }

    public void setN(Node n) {
        this.n = n;
    }
}
