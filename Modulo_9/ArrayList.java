package Modulo_9;

public class ArrayList {
    public static void main(String[] args) {
        // Ejemplo de uso de ArrayList en Java

        // Importar la clase ArrayList
        java.util.ArrayList<String> lista = new java.util.ArrayList<>();

        // Agregar elementos a la lista
        lista.add("Elemento 1");
        lista.add("Elemento 2");
        lista.add("Elemento 3");

        // Imprimir los elementos de la lista
        System.out.println("Elementos de la lista:");
        for (String elemento : lista) {
            System.out.println(elemento);
        }

        // Obtener un elemento por su índice
        String elementoEnIndice1 = lista.get(1);
        System.out.println("Elemento en el índice 1: " + elementoEnIndice1);

        // Eliminar un elemento por su índice
        lista.remove(0);
        System.out.println("Lista después de eliminar el primer elemento:");
        for (String elemento : lista) {
            System.out.println(elemento);
        }

        // Obtener el tamaño de la lista
        int tamaño = lista.size();
        System.out.println("Tamaño de la lista: " + tamaño);
    }
}
