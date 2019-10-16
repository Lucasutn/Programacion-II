/*Ejercicios de repaso. Para cada uno de los items elaborar una solución basado en funciones:
- Realizar un programa que detecte e informe si dos números son amigos. Dos números son amigos
 si la suma de los divisores del primero (sin contar al número) es igual al segundo, y viceversa*/


public class Numeros {

    public static String numerosAmigos(int a,int b){

        int sumaDivisoresA=0;
        int sumaDivisoresB=0;

        //ciclo for busca los divisores dek numero ingresado y lo suma en la variable int sumaDivisores en caso de ser un divisor
        for(int i=1;i<a;i++){

            if(a%i==0){
                sumaDivisoresA=sumaDivisoresA+i;
            }
        }

//Compara si la suma de divisores es igual a B y continua o termina el programa

        if(sumaDivisoresA!=b){

            return "Los números no son amigos";
        }

        for(int i=1;i<b;i++){

            if(b%i==0){
                sumaDivisoresB=sumaDivisoresB+i;
            }
        }

        if(sumaDivisoresB==a){

            return "Los números son amigos";
        }else{
            return "Los numeros no son amigos";
        }




    }

// Programa principal y funcion en el mismo archivo de codigo


    public static void main(String[] args){


        System.out.println(numerosAmigos(6,6));

    }


}
