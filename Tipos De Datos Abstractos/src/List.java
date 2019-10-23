import com.sun.xml.internal.bind.v2.model.core.ID;

public class List {

    private Nodo primerNodo;

    public Nodo getPrimerNodo() {
        return primerNodo;
    }

    public List(Nodo primerNodo) {
        this.primerNodo = primerNodo;
    }

    public List() {
    }


    public void agregar(int num) {

        Nodo n1 = new Nodo(num);

        if (this.primerNodo == null) {

            n1.setID(0);
            this.primerNodo = n1;

        } else {

            recorrerYAgregar(this.primerNodo, n1);


        }

    }

    /**
     *funcion encapsulada en agregar()
     */
    private void recorrerYAgregar(Nodo nodo, Nodo n1) {

        if (nodo.getNext() == null) {
            n1.setBack(nodo);
            nodo.setNext(n1);
            n1.setID(nodo.getID()+1);

        } else {

            recorrerYAgregar(nodo.getNext(), n1);

        }


    }
    /**
     * funcion para agregar un nuevo nodo el la posicion solicitada de 0 a n*/
    public void agregarNodo(Nodo newNodo, int id){
        Nodo aux = this.primerNodo;
        addNodo(newNodo,id,aux);
    }

    /**
     * funcion encapsulada en {@link}
     * */
    private void addNodo(Nodo newNodo, int id, Nodo nodo){



        if(id == 0 ){

            newNodo.setNext(nodo);
            nodo.setBack(newNodo);
            this.primerNodo=newNodo;
            setIDList(nodo,id);
            return;

//            nodo.getBack().setNext(newNodo);
//            newNodo.setNext(nodo);
//            newNodo.setBack(nodo.getBack());
//            nodo.setBack(newNodo);
//            nodo.setID(id);
//
//            setIDList(newNodo,id);

        }else if(nodo.getID()== id){

            nodo.getBack().setNext(newNodo);
            newNodo.setBack(nodo.getBack());
            newNodo.setNext(nodo);
            nodo.setBack(newNodo);
            setIDList(newNodo,id-1);

            return;
        }
            addNodo(newNodo,id,nodo.getNext());



    }

    /**
     * Funcion para aumentar el ID++*/
    private void setIDList(Nodo nodo, int id){

        nodo.setID(id+1);

        if(nodo.getNext()!=null){

            setIDList(nodo.getNext(),++id);
        }

//        if(nodo.getNext()!= null) {
//            nodo.getNext().setID(id + 1);
//            setIDList(nodo.getNext(),id++);
//        }


    }


    public void imprimir(){
        recorrerEImprimir(this.primerNodo);
    }

    public void recorrerEImprimir(Nodo nodo){

        if(nodo==null){
            System.out.println(nodo);
        }else {

            System.out.println(nodo.getData());

            recorrerEImprimir(nodo.getNext());

        }

    }

//    public void recorrer(){
//
//        recorrerFuntion(this.primerNodo);
//
//    }
//
//    public Nodo recorrerFuntion(Nodo nodo){
//
//        if(nodo.getNext()==null){
//
//            return nodo;
//
//        }else {
//
//            recorrerFuntion(nodo.getNext());
//
//        }
//
//        return nodo;
//
//    }
//

}
