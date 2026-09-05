package Modulo_4;

public class BucleWhile {
    public static void main(String[] args) {
        // Bucle While - Permite ejecutar un bloque de código mientras una condición sea verdadera

        int contador = 0;

        // Ejemplo de bucle while
        while (contador < 5) {
            System.out.println("Contador: " + contador);
            contador++;
        }

        // Ejemplo de bucle while con una condición que nunca se cumple
        int numero = 10;
        while (numero < 5) {
            System.out.println("Este mensaje no se mostrará.");
            numero++;
        }
    }
}
