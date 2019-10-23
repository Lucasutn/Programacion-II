public class Nodo {

    private int data;
    private Nodo next;
    private Nodo back;
    private int ID;

    public Nodo() {
    }

    public Nodo(int data) {
        this.data = data;

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

    public Nodo getBack() {
        return back;
    }

    public void setBack(Nodo back) {
        this.back = back;
    }
}
