package Modulo_1;

public class OperadoresComparacion {
    public static void main(String[] args) {
        // Operadores de Comparación - Comparan valores y devuelven un valor booleano (true o false)

        int numero1 = 10;
        int numero2 = 5;

        // Igual a
        boolean igualA = numero1 == numero2;
        System.out.println("Igual a: " + igualA);

        // Diferente de
        boolean diferenteDe = numero1 != numero2;
        System.out.println("Diferente de: " + diferenteDe);

        // Mayor que
        boolean mayorQue = numero1 > numero2;
        System.out.println("Mayor que: " + mayorQue);

        // Menor que
        boolean menorQue = numero1 < numero2;
        System.out.println("Menor que: " + menorQue);

        // Mayor o igual que
        boolean mayorOIgualQue = numero1 >= numero2;
        System.out.println("Mayor o igual que: " + mayorOIgualQue);

        // Menor o igual que
        boolean menorOIgualQue = numero1 <= numero2;
        System.out.println("Menor o igual que: " + menorOIgualQue);
    }
}
