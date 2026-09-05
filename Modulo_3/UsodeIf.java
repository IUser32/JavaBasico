package Modulo_3;

public class UsodeIf {
    public static void main(String[] args) {

        boolean esMayorDeEdad = true; // TRUE or FALSE
        boolean tieneLicencia = false; // TRUE or FALSE

        // Uso de la estructura if - Permite ejecutar bloques de código basados en condiciones

        int numero = 10;

        // Condición simple
        if (numero > 0) { // SIEMPRE Y CUANDO LA CONDICION SEA VERDADERA, SE EJECUTARÁ EL BLOQUE DE CÓDIGO
            System.out.println("El número es positivo.");
        }

        // Condición con else
        if (numero < 0) {
            System.out.println("El número es negativo.");
        } else {
            System.out.println("El número no es negativo.");
        }

        // Condición con else if
        if (numero == 0) {
            System.out.println("El número es cero.");
        } else if (numero > 0) {
            System.out.println("El número es positivo.");
        } else {
            System.out.println("El número es negativo.");
        }

        // Varios if anidados
        if (esMayorDeEdad) {
            if (tieneLicencia) {
                System.out.println("Puede conducir.");
            } else {
                System.out.println("No puede conducir, necesita una licencia.");
            }
        } else {
            System.out.println("No puede conducir, es menor de edad.");
        }

        // Varios if con else if
        if (esMayorDeEdad && tieneLicencia) {
            System.out.println("Puede conducir legalmente.");
        } else if (esMayorDeEdad && !tieneLicencia) {
            System.out.println("No puede conducir legalmente, necesita una licencia.");
        } else {
            System.out.println("No puede conducir legalmente, es menor de edad.");
        }
    }
}
