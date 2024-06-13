package Ejercicios_LISTAS;

public class _9_InterseccionListas {
    public static void main(String[] args) {
        int[] lista1 = {1, 2, 5, 3};
        int[] lista2 = {5, 3, 7, 6};

        System.out.print("Lista 1: ");
        mostrarLista(lista1);
        System.out.print("Lista 2: ");
        mostrarLista(lista2);

        int[] interseccion = encontrarInterseccion(lista1, lista2);

        System.out.print("Intersección de las listas: ");
        mostrarLista(interseccion);
    }

    public static int[] encontrarInterseccion(int[] lista1, int[] lista2) {
        int[] temp = new int[Math.min(lista1.length, lista2.length)];
        int index = 0;

        for (int i = 0; i < lista1.length; i++) {
            for (int j = 0; j < lista2.length; j++) {
                if (lista1[i] == lista2[j]) {
                    temp[index++] = lista1[i];
                    break;
                }
            }
        }

        int[] interseccion = new int[index];
        System.arraycopy(temp, 0, interseccion, 0, index);
        return interseccion;
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

