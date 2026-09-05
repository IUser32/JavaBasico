package Modulo_3;

public class UsoSwitch {
    public static void main(String[] args) {
        // Uso de la estructura switch - Permite ejecutar bloques de código basados en el valor de una variable

        int dia = 3; // 1: Lunes, 2: Martes, 3: Miércoles, 4: Jueves, 5: Viernes, 6: Sábado, 7: Domingo

        switch (dia) {
            case 1:
                System.out.println("Hoy es Lunes.");
                break;
            case 2:
                System.out.println("Hoy es Martes.");
                break;
            case 3:
                System.out.println("Hoy es Miércoles.");
                break;
            case 4:
                System.out.println("Hoy es Jueves.");
                break;
            case 5:
                System.out.println("Hoy es Viernes.");
                break;
            case 6:
                System.out.println("Hoy es Sábado.");
                break;
            case 7:
                System.out.println("Hoy es Domingo.");
                break;
            default:
                System.out.println("Día no válido.");
        }

        // Ejemplo de esto mismo con IF
        if (dia == 1) {
            System.out.println("Hoy es Lunes.");
        } else if (dia == 2) {
            System.out.println("Hoy es Martes.");
        } else if (dia == 3) {
            System.out.println("Hoy es Miércoles.");
        } else if (dia == 4) {
            System.out.println("Hoy es Jueves.");
        } else if (dia == 5) {
            System.out.println("Hoy es Viernes.");
        } else if (dia == 6) {
            System.out.println("Hoy es Sábado.");
        } else if (dia == 7) {
            System.out.println("Hoy es Domingo.");
        } else {
            System.out.println("Día no válido.");
        }
    }
}
