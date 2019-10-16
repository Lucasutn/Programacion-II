
/*- Realizar un programa que detecte e informe si un numero dado es perfecto. Los números perfectos
 son aquellos números que son iguales a la suma de sus divisores, por ejemplo, el 6 es un números
 perfecto (6 = 1 + 2 + 3) y también el 28 (= 1 + 2 + 4 + 7 + 14).*/

public class NumeroPerfecto {

    public static String numeroPerfecto(int numeroA){

        int sumaDivisoresA=0;

        for(int i=1;i<numeroA;i++){

            if(numeroA%i==0){
                sumaDivisoresA=sumaDivisoresA+i;
            }
        }

        if(numeroA==sumaDivisoresA){

            return "El numero " + numeroA + " es un número Perfecto";
        }else{
            return "El numero " + numeroA + " NO es un número Perfecto";
        }

    }

    public static void main(String[] args){


        System.out.println( numeroPerfecto(10));


    }




}
