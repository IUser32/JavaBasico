package Modulo_3;

public class Validaciones {
    public static void main(String[] args) {
        // Validaciones - Permiten verificar condiciones antes de ejecutar acciones

        int edad = 20;
        boolean tieneLicencia = true;

        // Validación de edad
        if (edad >= 18) {
            System.out.println("Es mayor de edad.");
        } else {
            System.out.println("Es menor de edad.");
        }

        // Validación de licencia
        if (tieneLicencia) {
            System.out.println("Tiene licencia para conducir.");
        } else {
            System.out.println("No tiene licencia para conducir.");
        }

        // Validación combinada
        if (edad >= 18 && tieneLicencia) {
            System.out.println("Puede conducir legalmente.");
        } else {
            System.out.println("No puede conducir legalmente.");
        }
    }
}
