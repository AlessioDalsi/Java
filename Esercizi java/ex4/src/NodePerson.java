/**
 * Created by Alessio on 06/10/2016.
 */
public class NodePerson extends Node{
    private Person item;

    public Person getItem() {
        return item;
    }

    public void setItem(Person item) {
        this.item = item;
    }

    public NodePerson(Person item){
        this.item = item;
    }
}
