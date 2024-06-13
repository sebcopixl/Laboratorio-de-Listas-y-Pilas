package Ejercicios_LISTAS;
/*5.	Eliminar Duplicados: Escribe un programa que elimine los elementos  duplicados  de  una lista.
Ejemplo: [1, 2, 2, 3, 4, 4, 5] → [1, 2, 3, 4, 5]
*/

public class _5_EliminarDuplicados {
    public static void main(String[] args) {
        int[] lista = {1, 2, 2, 3, 4, 4, 5};

        System.out.print("Lista original: ");
        mostrarLista(lista);

        int[] listaSinDuplicados = eliminarDuplicados(lista);

        System.out.print("Lista sin duplicados: ");
        mostrarLista(listaSinDuplicados);
    }

    public static int[] eliminarDuplicados(int[] lista) {
        int[] listaSinDuplicados = new int[lista.length];
        int indiceActual = 0;

        for (int i = 0; i < lista.length; i++) {
            boolean duplicado = false;
            for (int j = 0; j < indiceActual; j++) {
                if (lista[i] == listaSinDuplicados[j]) {
                    duplicado = true;
                    break;
                }
            }
            if (!duplicado) {
                listaSinDuplicados[indiceActual] = lista[i];
                indiceActual++;
            }
        }

        int[] resultado = new int[indiceActual];
        System.arraycopy(listaSinDuplicados, 0, resultado, 0, indiceActual);
        return resultado;
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

