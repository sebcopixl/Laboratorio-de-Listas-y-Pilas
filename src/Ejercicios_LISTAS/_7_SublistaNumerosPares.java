package Ejercicios_LISTAS;

public class _7_SublistaNumerosPares {
    public static void main(String[] args) {
        int[] lista = {1, 2, 3, 4, 5, 6};

        System.out.print("Lista original: ");
        mostrarLista(lista);

        int[] sublistaPares = obtenerSublistaPares(lista);

        System.out.print("Sublista de números pares: ");
        mostrarLista(sublistaPares);
    }

    public static int[] obtenerSublistaPares(int[] lista) {
        int countPares = contarPares(lista);
        int[] sublistaPares = new int[countPares];
        int currentIndex = 0;

        for (int i = 0; i < lista.length; i++) {
            if (lista[i] % 2 == 0) {
                sublistaPares[currentIndex] = lista[i];
                currentIndex++;
            }
        }

        return sublistaPares;
    }

    public static int contarPares(int[] lista) {
        int countPares = 0;
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] % 2 == 0) {
                countPares++;
            }
        }
        return countPares;
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

