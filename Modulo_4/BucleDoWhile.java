package Modulo_4;

public class BucleDoWhile {
    public static void main(String[] args) {
        // Bucle Do-While - Similar al bucle while, pero garantiza que el bloque de código se ejecute al menos una vez

        int contador = 0;

        // Ejemplo de bucle do-while
        do {
            System.out.println("Contador: " + contador);
            contador++;
        } while (contador < 5);

        // Ejemplo de bucle do-while con una condición que nunca se cumple
        int numero = 10;
        do {
            System.out.println("Este mensaje se mostrará al menos una vez.");
            numero++;
        } while (numero < 5);
    }
}
