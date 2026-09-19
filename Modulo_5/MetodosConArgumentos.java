package Modulo_5;

public class MetodosConArgumentos {
    public static void main(String[] args) {
        // Llamada a un método con argumentos
        int resultado = multiplicar(5, 10);
        System.out.println("Resultado de la multiplicación: " + resultado);

        // Llamada a un método con argumentos y retorno de valor
        String mensaje = concatenar("Hola", "Mundo");
        System.out.println("Mensaje concatenado: " + mensaje);
    }

    // Método que multiplica dos números y devuelve el resultado
    public static int multiplicar(int a, int b) {
        return a * b;
    }

    // Método que concatena dos cadenas y devuelve el resultado
    public static String concatenar(String str1, String str2) {
        return str1 + " " + str2;
    }
}
