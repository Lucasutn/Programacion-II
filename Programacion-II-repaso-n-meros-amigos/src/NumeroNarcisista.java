
/*- Realizar un programa que detecte e informe si un numero dado es narcisista. Se dice que un número
 es narcisista si es igual a la suma de las potencias de sus cifras elevadas a la cantidad de cifras
 del número. Así, el número narcisista más pequeño es 153, que tiene 3 cifras y 1 elevado a 3 + 5 elevado a 3 + 3 elevado a 3 = 153.*/
public class NumeroNarcisista {

    public static void numeroNarcisista(int a) {

        int contCifras=0;
        int numeroTest=a;
        int digitos;
        double acumSuma=0;


        while(numeroTest!=0){
            numeroTest=numeroTest/10;
            contCifras++;
        }

        numeroTest=a;

        for(int i=0;i<contCifras;i++){

            digitos=numeroTest%10;
            acumSuma= acumSuma+ Math.pow(digitos,contCifras);
            numeroTest=numeroTest/10;
        }

        if(acumSuma==a){
            System.out.println("Narcisista");
        }else {
            System.out.println("No Narcisista");
        }




    }

    /*PROGRAMA PRINCIPAL*/


    public static void main(String[] args) {


        numeroNarcisista(152);
    }
}