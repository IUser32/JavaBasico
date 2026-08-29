package Modulo_1;
public class Casting {
    public static void main(String[] args) {
        // Casting - Conversion de tipos de datos

        // Ejemplo 1: De int a double
        int numeroEntero = 10;
        double numeroDecimal = (double) numeroEntero; // Casting explícito
        System.out.println("Número entero: " + numeroEntero);
        System.out.println("Número decimal: " + numeroDecimal);

        // Ejemplo 2: De double a int
        double otroNumeroDecimal = 9.99;
        int otroNumeroEntero = (int) otroNumeroDecimal; // Casting explícito
        System.out.println("Otro número decimal: " + otroNumeroDecimal);
        System.out.println("Otro número entero: " + otroNumeroEntero);

        // Ejemplo 3: De char a int
        char caracter = '@';
        int valorAscii = (int) caracter; // Casting explícito
        System.out.println("Caracter: " + caracter);
        System.out.println("Valor ASCII: " + valorAscii);
    }
}
