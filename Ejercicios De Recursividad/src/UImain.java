import javax.swing.*;


public class UImain {


    private static final int ZERO_NUMBER = 0;


    private UImain() {
    }

    /**
     * Ejercicio 12:
     * Escriba un algoritmo recursivo que permita sumar todos los valores contenidos en un arreglo de números
     * enteros. Solicitar al usuario que defina el tamaño del arreglo y luego cargar los valores de dicho arreglo.
     *
     * see {@link RecursiveFunction#arraySuma(int[], int, int)}
     *
     */
    public static void sumarValorArreglo() {

        int arregloLongitud = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la longitud del Arreglo que desea crear: "));

        int[] arregloNumeros = new int[arregloLongitud];

        for (int i = 0; i < arregloLongitud; i++) {


            arregloNumeros[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero entero"));

        }

//        for (int a : arregloNumeros) {
//
//            System.out.println(a);
//
//        }

        JOptionPane.showMessageDialog(null,"Suma Total: " + RecursiveFunction.arraySuma(arregloNumeros,arregloLongitud-1,ZERO_NUMBER));

    }

    /**
     * Ejercicio 15:
     * Escribir un algoritmo recursivo que permita realizar la búsqueda del mayor número entero dentro de un
     * arreglo de números enteros. Solicitar al usuario que defina el tamaño del arreglo y luego cargar los
     * valores de dicho arreglo.*/

    public static void BuscarMayorArray() {

        int arregloLongitud = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la longitud del Arreglo que desea crear: "));

        int[] arregloNumeros = new int[arregloLongitud];

        for (int i = 0; i < arregloLongitud; i++) {


            arregloNumeros[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero entero"));

        }

//        for (int a : arregloNumeros) {
//
//            System.out.println(a);
//
//        }

        JOptionPane.showMessageDialog(null,"El Mayor Numero Entero es : " + RecursiveFunction.numeroMayor(arregloNumeros,arregloLongitud-1,ZERO_NUMBER) );

    }


}
