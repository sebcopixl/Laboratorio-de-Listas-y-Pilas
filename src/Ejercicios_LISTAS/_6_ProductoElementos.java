package Ejercicios_LISTAS;

/*1.	Producto de Elementos: Escribe un programa que reciba una lista de nu´meros y devuelva el producto de todos los elements.
Ejemplo: [1, 2, 3, 4] → 24
*/

public class _6_ProductoElementos {
    public static void main(String[] args) {
        int[] lista = {1, 3, 5, 7};

        System.out.print("Lista original: ");
        mostrarLista(lista);

        int producto = calcularProducto(lista);

        System.out.println("El producto de los elementos es: " + producto);
    }

    public static int calcularProducto(int[] lista) {
        int producto = 1;
        for (int i = 0; i < lista.length; i++) {
            producto *= lista[i];
        }
        return producto;
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

