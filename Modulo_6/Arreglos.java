package Modulo_6;

public class Arreglos {
    public static void main(String[] args) {
        // Arreglos - Permiten almacenar múltiples valores del mismo tipo en una sola variable

        // Declaración e inicialización de un arreglo de enteros
        int[] numeros = {1, 2, 3, 4, 5};

        // Acceso a los elementos del arreglo mediante un bucle for
        System.out.println("Elementos del arreglo:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Elemento en la posición " + i + ": " + numeros[i]);
        }

        // Modificación de un elemento del arreglo
        numeros[2] = 10;
        System.out.println("Después de modificar el tercer elemento:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Elemento en la posición " + i + ": " + numeros[i]);
        }
    }
}
