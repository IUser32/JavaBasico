package Modulo_5;

public class MetodosSImples {
    public static void main(String[] args) {
        // Llamada a un método simple
        saludar();
        int resultado = sumar(5, 10);
        System.out.println("Resultado de la suma: " + resultado);
    }

    // Método simple que imprime un saludo
    public static void saludar() {
        System.out.println("¡Hola! Este es un método simple.");
    }

    // Método simple que suma dos números y devuelve el resultado
    public static int sumar(int a, int b) {
        return a + b;
    }
}
