package Modulo_5;

public class MetodosConSobrecarga {
    public static void main(String[] args) {
        // Llamada a métodos con sobrecarga
        saludar();
        saludar("Juan");
        int resultado1 = sumar(5, 10);
        int resultado2 = sumar(3, 4, 5);
        System.out.println("Resultado de la suma (2 parámetros): " + resultado1);
        System.out.println("Resultado de la suma (3 parámetros): " + resultado2);
    }

    // Método simple que imprime un saludo
    public static void saludar() {
        System.out.println("¡Hola! Este es un método simple.");
    }

    // Método sobrecargado que imprime un saludo personalizado
    public static void saludar(String nombre) {
        System.out.println("¡Hola, " + nombre + "! Este es un método sobrecargado.");
    }

    // Método simple que suma dos números y devuelve el resultado
    public static int sumar(int a, int b) {
        return a + b;
    }

    // Método sobrecargado que suma tres números y devuelve el resultado
    public static int sumar(int a, int b, int c) {
        return a + b + c;
    }
}
