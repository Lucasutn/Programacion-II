import javax.swing.*;

/**
 * Clase con todas las funciones Recursivas para Ejercios de Recursividad
 * Programacion II
 */

public class RecursiveFunction {


    private static final int CONST_NUMBER_ONE = 1;
    private static final int CONST_NUMBER_ZERO = 0;
    private static int REVERSE_NUMBER;
    private static int STATIC_NUMBER;


    private RecursiveFunction() {
    }

    /**
     * Ejercion 1- Realizar un procedimiento que imprima de manera recursiva los números del 1 al 10.
     */

    public static int UnoALDiez(int n) {

        if (n > 0) {

            UnoALDiez(n - 1);

            System.out.println("Number: " + n);

        }

        return n;


    }


    /**
     * Ejercicio 2 - Realizar un procedimiento que imprima de manera recursiva la tabla del 9.
     *
     * @param n longitud de la tabla requerida de 1 a n
     */

    public static int TablaDelNueve(int n) {

        int number = n;


        if (n > 0) {

            TablaDelNueve(number - 1);


            while (number != 9) {
                number++;
            }


            System.out.println(n + " X " + number + " = " + n * number);
        }


        return 0;
    }


    /**
     * Ejerc 3 - Realizar un procedimiento que encuentre el número mayor de un vector de n números enteros de manera recursiva.
     *
     * @param array         recibe el array en el cual se va a realizar la busqueda
     * @param arrayLongitud recibe la longitud del array
     * @param mayor         recibe cualquier numero, campo obligatorio
     */

    public static int numeroMayor(int[] array, int arrayLongitud, int mayor) {


        if (arrayLongitud != -1) {

            if (array[arrayLongitud] > mayor) {

                mayor = array[arrayLongitud];

            }

            mayor = numeroMayor(array, arrayLongitud - 1, mayor);
        }

        return mayor;


    }


    /**
     * funcion fibonacci retorna un numero ubicado en determinada posicion de la seleccion ej termino 10 = 55
     */
    public static int fibbonacci(int n) {


        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return (fibbonacci(n - 1) + fibbonacci(n - 2));
        }

    }

    /**
     * Ejercicio 4:
     * La secuencia fibonacci es una parte famosa de la matemática. La misma posee una definición recursiva
     * en donde los dos primeros valores de la secuencia son 0 y 1 (esencialmente 2 casos base) y cada valor
     * posterior es la suma de los dos valores anteriores, por lo que toda la secuencia es: 0, 1, 1, 2, 3, 5, 8, 13,
     * 21 y así sucesivamente.
     * Se solicita definir un método de fibonacci recursivo (n) que devuelve el número fibonacci n-ésimo, con n
     * = 0 representando el inicio de la secuencia. Ej:
     * fibonacci(0) → 0
     * fibonacci(1) → 1
     * fibonacci(2) → 1
     * <p>
     * Llama de manera recursiva al metodo fibbonacci,  una X cantidad de terminos
     *
     * @param n recibe la cantidad de terminos a mostrar de la seleccion
     * @see #fibbonacci(int)
     */

    public static int recursiveFibonacci(int n) {

        if (n == 0) {
            return 0;
        } else {

            recursiveFibonacci(n - 1);

            System.out.println("fibonacci(" + (n - 1) + ")" + " → " + fibbonacci(n - 1));
        }

        return 0;
    }


    /**
     * Llama de manera recursiva al metodo fibbonaci, hasta determinado termino
     *
     * @param n recibe el termino hasta el cual se desea mostrar
     */
    public static int recursiveFibonacciNum(int n) {

        int num = 0;
        int cont = 0;

        while (n > num) {

            num = fibbonacci(cont);

            if (n > num) {
                System.out.println("fibonacci(" + (cont) + ")" + " → " + num);
            }

            cont++;
        }

        return 0;


    }

    /**
     * Ejercicio 5:
     * Tenemos un número de conejitos y cada conejito tiene dos grandes orejas. Se quiere calcular el número
     * total de orejas en todos los conejos recursivamente (sin bucles o multiplicación). Escriba una función
     * recursiva para obtener dicho total. Ej:
     * bunnyEars(0) → 0
     * bunnyEars(1) → 2
     * bunnyEars(2) → 4
     *
     * @param n recibe cantidad de conejos
     */

    public static int bunnyEars(int n) {


        if (n == 0) {
            System.out.println("bunnyEars(" + n + ")" + "→ " + 0);
        } else {

            bunnyEars(n - 1);

            int a = n;
            int b = a;
            a += b;

            System.out.println("bunnyEars(" + n + ")" + "→ " + a);
        }


        return 0;

    }


    /**
     * Ejercicio 6:
     * Tenemos conejitos de pie en una línea, numerados 1, 2, ... Los conejitos en posiciones impares (1, 3, ..)
     * tienen las 2 orejas normales. Los conejos en las posiciones pares (2, 4, ..) diremos que tienen 3 orejas,
     * porque cada uno tiene un pie levantado. Escriba una función que devuelva recursivamente el número de
     * "orejas" en la línea de conejos 1, 2, ... n (sin bucles o multiplicación).
     * bunnyEars2(0) → 0
     * bunnyEars2(1) → 2
     * bunnyEars2(2) → 5
     *
     * @param n recibe cantidad de conejos
     * @param a tiene que ser 0 por default se utiliza para contar las catidad de orejas
     * @param b tiene que ser 0 por default  se utiliza para representar la cantidad de conejos.
     */

    //Se puede hacer una mayor abstraccion, tratar encapsular aun mas.
    public static int bunnyEarsTres(int n, int a, int b) {


        if (n == 0) {


            System.out.println("bunnyEars(" + b + ")" + "→ " + a);
            return 0;

        } else if (n % 2 != 0) {


            System.out.println("bunnyEars(" + b + ")" + "→ " + a);

            bunnyEarsTres(n - 1, a + 3, b + 1);

        } else {


            System.out.println("bunnyEars(" + b + ")" + "→ " + a);

            bunnyEarsTres(n - 1, a + 2, b + 1);
        }


        return 0;


    }


    /**
     * <p>
     * Ejercicio 7:
     * Dado un número entero N, obtener el factorial del mismo siguiendo el algoritmo n * (n-1) * (n-2) ... 1.
     * Escribir una función recursiva (sin bucles o multiplicación).
     * factorial(1) → 1
     * factorial(2) → 2
     * factorial(3) → 6
     * </p>
     *
     * @param n recibe un numero entero
     * @return retorna el factorial de n
     * <p></p>see {@link #factorialFuntion(int, int)}.
     */

    public static int factorialNumber(int n) {

        return factorialFuntion(n, CONST_NUMBER_ONE);
    }

    /**
     * @param n recibe el numero a calcular el factorial
     * @param b acumulador siempre debe inicializar en 1
     * @return b es el resultado acumulado
     */
    private static int factorialFuntion(int n, int b) {

        if (n == 0) {
            return b;
        } else {

            b = factorialFuntion(n - 1, b * n);

            return b;
        }


    }

    /**
     * <h3>Factorial Resultado Recursivo</h3>
     *
     * @param n recibe la cantidad de terminos de 0 a n por Ej.:
     *          <p>
     *          factorial(0)→ 1
     *          <p>
     *          factorial(1)→ 1
     *          <p>
     *          factorial(2)→ 2
     *          <p>
     *          factorial(3)→ 6
     *          <p>
     *          factorial(4)→ 24
     *          <p>
     *          factorial(5)→ 120
     */

    public static int factorialNumberRecursive(int n) {

        if (n == 0) {

            System.out.println("factorial(" + n + ")" + "→ " + factorialNumber(n));

            return 0;
        }

        factorialNumberRecursive(n - 1);

        System.out.println("factorial(" + n + ")" + "→ " + factorialNumber(n));


        return 0;


    }

    /**
     * <p>
     * Ejercicio 8:
     * Escribir una función que realice la división de 2 número enteros mediante sucesivas restas utilizando
     * recursividad.
     *
     * @param numerator
     * @param denominator <p>muestra por pantalla el resultado de la division
     *                    <p>
     *                    see {@link #division(int, int, int)}
     */

    public static void divisionEnteros(int numerator, int denominator) {

        System.out.println(division(numerator, denominator, CONST_NUMBER_ZERO));
    }

    /**
     * Metodo privado: realiza division entre dos numeros enteros y retorna su resultado
     *
     * @param acum contador donde se van sumando la cantidad de veces que se puede restar el demonominador al acumulador
     * @return acum
     */
    private static int division(int numerator, int denominator, int acum) {

        if (numerator == 0) {

            return acum;
        }

        acum = division(numerator - denominator, denominator, acum + 1);

        return acum;

    }

    /**
     * Ejercicio 9:
     * Escribir un algoritmo recursivo que permita invertir un número entero: Ej: 123 => 321.
     * Sabiendo que:
     * - El módulo de 10 de cualquier número entero permite obtener el dígito que se encuentra más a la
     * derecha. Ej 126 % 10 => 6.
     * - Dividiendo cualquier número entero por 10 permite eliminar el dígito que se encuentra más a la
     * derecha. Ej 126 / 10 => 12.
     */

    public static int reverseNumber(int n) {

        return reverseFuntion(n, 0, 0);

    }

    private static int reverseFuntion(int n, int acum, int num) {


        if (n < 10) {

            REVERSE_NUMBER = num + n;
//            System.out.println(num + n);


//            return num + n;


        } else {

            acum = n % 10;
            num = num + acum;
            num *= 10;
            reverseFuntion(n / 10, acum, num);


        }


        return REVERSE_NUMBER;


    }

    /**
     * Ejercicio 10:
     * Escribir un algoritmo recursivo que permita obtener la suma de los dígitos de un número entero N.
     * Sabiendo que:
     * - El módulo de 10 de cualquier número entero permite obtener el dígito que se encuentra más a la
     * derecha. Ej 126 % 10 => 6.
     * - Dividiendo cualquier número entero por 10 permite eliminar el dígito que se encuentra más a la
     * derecha. Ej 126 / 10 => 12.
     * Ejemplo:
     * sumDigits(126) → 9
     * sumDigits(49) → 13
     * sumDigits(12) → 3
     */

    public static void sumDigits(int n) {

        System.out.println("sumDigits(" + n + ")" + "→ " + suma(n, 0, 0));
    }

    private static int suma(int n, int acum, int num) {

        if (n < 10) {

            REVERSE_NUMBER = num + n;
//            System.out.println(num + n);


//            return num + n;


        } else {

            acum = n % 10;
            num = num + acum;
//            num *= 10;
            suma(n / 10, acum, num);


        }


        return REVERSE_NUMBER;


    }

    /**
     * Ejercicio 11:
     * Escribir un algoritmo recursivo que permita contar la ocurrencia del dígito 7 en cualquier número entero
     * ingresado por teclado.
     * Sabiendo que:
     * - El módulo de 10 de cualquier número entero permite obtener el dígito que se encuentra más a la
     * derecha. Ej 126 % 10 => 6.
     * - Dividiendo cualquier número entero por 10 permite eliminar el dígito que se encuentra más a la
     * derecha. Ej 126 / 10 => 12.
     * Ejemplo:
     * contar7Funtion(717) → 2
     * contar7Funtion(7) → 1
     * contar(123) → 0
     */

    public static void contar7(int n) {

        System.out.println("contar7Funtion(" + n + ")" + "→ " + contar7Funtion(n, 0, 0));

    }


    private static int contar7Funtion(int n, int acum, int cont) {

        if (n < 10) {

            if (n == 7) {

//                cont++;

                STATIC_NUMBER = ++cont;

//                System.out.println(cont);


            }


        } else {

            acum = n % 10;

            if (acum == 7) {
                cont++;
            }
//            num *= 10;
            contar7Funtion(n / 10, acum, cont);


        }


        return STATIC_NUMBER;

    }

    /**
     * Ejercicio 12:
     * Escriba un algoritmo recursivo que permita sumar todos los valores contenidos en un arreglo de números
     * enteros. Solicitar al usuario que defina el tamaño del arreglo y luego cargar los valores de dicho arreglo.
     */

    public static int arraySuma(int[] array, int arrayLongitud, int total) {

        if (arrayLongitud == 0) {
            
//            total += array[arrayLongitud];

//            System.out.println(total);

            STATIC_NUMBER= total += array[arrayLongitud];

        }else {

            total+=array[arrayLongitud] ;

            arraySuma(array, arrayLongitud - 1, total);

//            System.out.println(total);
            
        }

        return STATIC_NUMBER;
    }


    /**
     * Ejercicio 13:
     * Escriba un algoritmo recursivo que permita saber si un número es positivo o negativo utilizando
     * Recursividad Indirecta (implementando llamada entre 2 métodos entre sí).*/

    public static void PositiveOrNegative(int n){

        while (n==0){

            n= Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero diferente de 0: "));
        }

        PositiveNumber(n);

    }

    private static void PositiveNumber(int n){

        if(n>0){
            System.out.println("Positivo");
        }else {
            NegativeNumber(n);
        }

    }

    private static void NegativeNumber(int n){

        if(n<0){
            System.out.println("Negativo");
        }else {
            PositiveNumber(n);
        }

    }


    /**
     * Ejercicio 14:
     * Escriba un algoritmo recursivo que permita saber si un número es impar utilizando Recursividad Indirecta
     * (implementando llamada entre 2 métodos entre sí).*/


//    public static String impar (int num){
//        if (num == 0)
//            return "Par";
////            return false;
//        else
//            return par(num-1);
//
//    }
//
//    public static String par (int num) {
//        if (num == 0)
//            return "Impar";
//
////            return true;
//        else
//           return impar(num-1);
//    }


    public static boolean impar (int num){
        if (num == 0)
            return false;
        else
            return par(num-1);
    }

    private static boolean par (int num) {
        if (num == 0)
            return true;
        else
            return impar(num-1);
    }




}
