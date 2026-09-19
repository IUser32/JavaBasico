package Modulo_10;

public class Excepciones {
    public static void main(String[] args) {
        // Ejemplo de manejo de excepciones en Java

        int[] numeros = {1, 2, 3};

        try {
            // Intentamos acceder a un índice que no existe
            System.out.println(numeros[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Se produjo una excepción: " + e.getMessage());
        } finally {
            System.out.println("Este bloque se ejecuta siempre, haya o no excepción.");
        }
    }
}
