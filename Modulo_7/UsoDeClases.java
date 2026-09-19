package Modulo_7;

public class UsoDeClases {
    public static void main(String[] args) {
        // Crear un objeto de la clase Persona
        Persona persona1 = new Persona("Juan", 25);
        Persona persona2 = new Persona("María", 30);

        // Llamar a los métodos de la clase Persona
        persona1.saludar();
        persona2.saludar();

        // Obtener y mostrar la edad de las personas
        System.out.println(persona1.getNombre() + " tiene " + persona1.getEdad() + " años.");
        System.out.println(persona2.getNombre() + " tiene " + persona2.getEdad() + " años.");
    }
}

class Persona {
    private String nombre;
    private int edad;

    // Constructor de la clase Persona
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Método para saludar
    public void saludar() {
        System.out.println("¡Hola! Mi nombre es " + nombre + " y tengo " + edad + " años.");
    }

    // Métodos getter para obtener el nombre y la edad
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
}
