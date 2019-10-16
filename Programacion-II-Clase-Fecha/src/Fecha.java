public class Fecha {


    private int dia;
    private int mes;
    private int año;

    protected String ArregloDeMeses[]= {"","Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre",
            "Octubre","Noviembre","Diciembre"};


    public Fecha(int dia, int mes, int año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }

    public void modificarFecha(int dia, int mes, int año){


        this.dia=dia;
        this.mes=mes;
        this.año=año;


    }


    public void mostrarFecha(){

        System.out.println(this.dia+"/"+this.mes+"/"+this.año);

    }

    public void mostrarFechaTexto(){

        System.out.println(this.dia+ " de "+ ArregloDeMeses[this.mes]+ " de "+ this.año);

    }

    public void modificarDia(int dia) {
        this.dia = dia;
    }

    public void modificicarMes(int mes) {
        this.mes = mes;
    }

    public void modificarAño(int año) {
        this.año = año;
    }

    @Override
    public String toString() {
        return "Fecha{" +
                "dia=" + dia +
                ", mes=" + mes +
                ", año=" + año +
                '}';
    }

}
