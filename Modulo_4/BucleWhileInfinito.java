package Modulo_4;

public class BucleWhileInfinito {
    public static void main(String[] args) {
        // Bucle While - Permite ejecutar un bloque de código mientras una condición sea verdadera

        int contador = 0;

        // Ejemplo de bucle while infinito
        while (contador < 5) {
            System.out.println("Contador: " + contador);
        }

        // Ejemplo de bucle while infinito
        while (true) {
            System.out.println("Este es un bucle while infinito. Presiona Ctrl+C para detenerlo.");
        }
    }
}
