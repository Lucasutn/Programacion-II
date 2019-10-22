public class Nodo {

    private int data;
    private Nodo next;
    private int ID;

    public Nodo() {
    }

    public Nodo(int data) {
        this.data = data;
        ID++;
    }


    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Nodo getNext() {
        return next;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
}
