package Modulo_6;

public class EjemploConStringBuilder {
    public static void main(String[] args) {
        // Ejemplo de uso de StringBuilder para construir una cadena de texto

        // Crear un objeto StringBuilder
        StringBuilder sb = new StringBuilder();

        // Agregar texto al StringBuilder
        sb.append("Hola, ");
        sb.append("este es un ejemplo ");
        sb.append("de uso de StringBuilder.");

        // Convertir el contenido del StringBuilder a una cadena de texto
        String resultado = sb.toString();

        // Imprimir el resultado
        System.out.println(resultado);
    }
}
