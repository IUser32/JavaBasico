package Modulo_6;

public class ArreglosConFor {
    public static void main(String[] args) {
        // Arreglos con bucle for - Permiten recorrer los elementos de un arreglo utilizando un bucle for

        // Declaración e inicialización de un arreglo de cadenas
        String[] frutas = {"Manzana", "Banana", "Cereza", "Durazno", "Uva"};

        // Acceso a los elementos del arreglo mediante un bucle for
        System.out.println("Elementos del arreglo de frutas:");
        for (int i = 0; i < frutas.length; i++) {
            System.out.println("Fruta en la posición " + i + ": " + frutas[i]);
        }

        // Modificación de un elemento del arreglo
        frutas[1] = "Mango";
        System.out.println("Después de modificar la segunda fruta:");
        for (int i = 0; i < frutas.length; i++) {
            System.out.println("Fruta en la posición " + i + ": " + frutas[i]);
        }
    }
}
