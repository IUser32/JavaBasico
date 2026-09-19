package Modulo_8;

public class PolimorfismoYHerencia {
    public static void main(String[] args) {
        // Ejemplo de polimorfismo en Java

        // Crear objetos de diferentes clases que implementan la misma interfaz
        Animal perro = new Perro();
        Animal gato = new Gato();

        // Llamar al método hacerSonido() en ambos objetos
        perro.hacerSonido(); // Salida: "El perro hace: Guau!"
        gato.hacerSonido();  // Salida: "El gato hace: Miau!"
    }
}

class Animal {
    // Método que será sobrescrito por las clases derivadas
    public void hacerSonido() {
        System.out.println("El animal hace un sonido.");
    }
}

class Perro extends Animal {
    // Sobrescribir el método hacerSonido() para la clase Perro
    @Override
    public void hacerSonido() {
        System.out.println("El perro hace: Guau!");
    }
}

class Gato extends Animal {
    // Sobrescribir el método hacerSonido() para la clase Gato
    @Override
    public void hacerSonido() {
        System.out.println("El gato hace: Miau!");
    }
}
