package Modulo_10;

public class ManejoArchivos {
    public static void main(String[] args) {
        // Ejemplo de manejo de archivos en Java

        java.io.File archivo = new java.io.File("archivo.txt");

        try {
            // Intentamos crear un nuevo archivo
            if (archivo.createNewFile()) {
                System.out.println("Archivo creado: " + archivo.getName());
            } else {
                System.out.println("El archivo ya existe.");
            }
        } catch (java.io.IOException e) {
            System.out.println("Se produjo una excepción al manejar el archivo: " + e.getMessage());
        } finally {
            System.out.println("Este bloque se ejecuta siempre, haya o no excepción.");
        }
    }
}
