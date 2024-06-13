package Ejercicios_LISTAS;
/*4.	Inversi´on  de  Lista: Escribe un programa que invierta una lista.
Ejemplo: [1, 2, 3, 4] → [4, 3, 2, 1]
*/

public class _4_InversionLista {
    public static void main(String[] args) {
        int[] lista = {1, 2, 3, 4};

        System.out.print("Lista original: ");
        mostrarLista(lista);

        int[] listaInvertida = invertirLista(lista);

        System.out.print("Lista invertida: ");
        mostrarLista(listaInvertida);
    }

    public static int[] invertirLista(int[] lista) {
        int[] listaInvertida = new int[lista.length];
        int j = 0;
        for (int i = lista.length - 1; i >= 0; i--) {
            listaInvertida[j] = lista[i];
            j++;
        }
        return listaInvertida;
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


