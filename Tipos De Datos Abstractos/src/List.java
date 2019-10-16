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


    public void agregar(int num){

        Nodo n1 = new Nodo(num);

        if(this.primerNodo==null){

            this.primerNodo= n1;

        }else {

            recorrerYAgregar(this.primerNodo,n1);


        }

    }

/**
 * */
    public void recorrerYAgregar(Nodo nodo,Nodo n1){

        if(nodo.getNext()==null){

            nodo.setNext(n1);

        }else{

            recorrerYAgregar(nodo.getNext(),n1);

        }


    }

//    public void imprimir(){
//        recorrerEImprimir(this.primerNodo);
//    }
//
//    public void recorrerEImprimir(Nodo nodo){
//
//        if(nodo==null){
//            System.out.println(nodo);
//        }else {
//
//            System.out.println(nodo.getData());
//
//            recorrerEImprimir(nodo.getNext());
//
//        }
//
//    }
//
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



}
