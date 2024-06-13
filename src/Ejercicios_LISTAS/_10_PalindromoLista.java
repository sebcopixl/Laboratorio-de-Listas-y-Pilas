package Ejercicios_LISTAS;

public class _10_PalindromoLista {
    public static void main(String[] args) {
        int[] lista = {76, 81, 7, 81, 76};

        System.out.print("Lista: ");
        mostrarLista(lista);

        boolean esPalindromo = verificarPalindromo(lista);

        if (esPalindromo) {
            System.out.println("La lista es un palíndromo.");
        } else {
            System.out.println("La lista no es un palíndromo.");
        }
    }

    public static boolean verificarPalindromo(int[] lista) {
        int i = 0;
        int j = lista.length - 1;

        while (i < j) {
            if (lista[i] != lista[j]) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void mostrarLista(int[] lista) {
        System.out.print("[");
        for (int i = 0; i < lista.length; i++) {
            System.out.print(lista[i]);
            if (i < lista.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}

