package Modulo_2;

public class EntradaDatos {
    public static void main(String[] args) {
        // Entrada de Datos - Permite al usuario ingresar datos desde la consola

        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();

        System.out.println("Hola " + nombre + ", tienes " + edad + " años.");

        scanner.close();
    }
}
