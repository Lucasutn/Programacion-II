public class Main {

    public static void main(String[] args) {


        List L1 = new List();

        L1.agregar(1);
        L1.agregar(2);
        L1.agregar(3);
        L1.agregar(8);

        Nodo n1 = new Nodo(9);
//        Nodo n2 = new Nodo(19);

        L1.agregarNodo(n1,8);
//        L1.agregarNodo(n2,4);

//        System.out.println(L1.getPrimerNodo().getID());


       L1.imprimir();

//        System.out.println(L1.getPrimerNodo().getID());
//        System.out.println(L1.getPrimerNodo().getNext().getID());

//        System.out.println(L1.getPrimerNodo().getNext().getBack().getData());

    }
}
