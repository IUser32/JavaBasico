package Modulo_1;

public class OperadoresLogicos {
    public static void main(String[] args) {
        // Operadores Lógicos - Permiten combinar condiciones booleanas

        boolean esMayorDeEdad = true;
        boolean tieneLicencia = false;


        // && -> Para que de un valor verdadero TODAS las condiciones deben ser verdaderas.


        // Operador AND (&&)
        if (esMayorDeEdad && tieneLicencia) {
            System.out.println("Puede conducir.");
        } else {
            System.out.println("No puede conducir.");
        }

        // || -> Para que de un valor verdadero AL MENOS UNA de las condiciones debe ser verdadera.
        // Operador OR (||)
        if (esMayorDeEdad || tieneLicencia) {
            System.out.println("Puede acceder al club.");
        } else {
            System.out.println("No puede acceder al club.");
        }

        
        // Operador NOT (!)
        if (!tieneLicencia) {
            System.out.println("Debe obtener una licencia para conducir.");
        }
    }
}
