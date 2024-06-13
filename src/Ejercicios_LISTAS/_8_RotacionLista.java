package Ejercicios_LISTAS;

public class _8_RotacionLista {
    public static void main(String[] args) {
        int[] lista = {1, 2, 3, 4, 5};
        int k = 2;

        System.out.print("Lista original: ");
        mostrarLista(lista);

        int[] listaRotada = rotarLista(lista, k);

        System.out.print("Lista rotada a la derecha por " + k + " posiciones: ");
        mostrarLista(listaRotada);
    }

    public static int[] rotarLista(int[] lista, int k) {
        int[] listaRotada = new int[lista.length];
        int n = lista.length;

        for (int i = 0; i < n; i++) {
            listaRotada[(i + k) % n] = lista[i];
        }

        return listaRotada;
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

