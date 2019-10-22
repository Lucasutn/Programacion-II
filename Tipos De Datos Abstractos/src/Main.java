public class Main {

    public static void main(String[] args) {


        List L1 = new List();

        L1.agregar(1);
        L1.agregar(2);
        L1.agregar(3);
        L1.agregar(4);

//       L1.imprimir();

        System.out.println(L1.getPrimerNodo().getID());
        System.out.println(L1.getPrimerNodo().getNext().getID());

    }
}
